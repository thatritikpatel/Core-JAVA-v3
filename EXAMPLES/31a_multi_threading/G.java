class Account{
	private int balance = 50;

	synchronized int getBalance(){
		return balance;
	}

	synchronized void withdraw(int amt,int i){
		Thread t = Thread.currentThread();
		if(balance>=amt){
			System.out.println(t.getName()+" going to withdraw money : "+i+" current balance: "+balance);	
			try{Thread.sleep(1000);}catch(InterruptedException e){ e.printStackTrace();}
			balance -= amt;
			System.out.println(t.getName()+" Balance after transaction :"+i+" Balance: "+balance);	
		}
	}
}

class AccountThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			G.ac.withdraw(10,i);
		}
	}
}

class G{
	static Account ac = new Account();	

	public static void main(String[] args){
		AccountThread t1 = new AccountThread();
		t1.setName("Ganesh");

		AccountThread t2 = new AccountThread();
		t2.setName("Mahesh");

		t1.start();
		t2.start();
	}
}



