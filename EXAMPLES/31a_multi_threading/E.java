class Account{
	int balance = 50;

	int getBalance(){
		return balance;
	}

	void withdraw(int amt){
		balance -= amt;
	}
}

class AccountThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		
		for(int i=0;i<5;i++){
			if(E.ac.balance>=10){
				System.out.println(t.getName()+" going to withdraw money :"+i+" current balance: "+E.ac.balance);	
				try{Thread.sleep(1000);}catch(InterruptedException e){ e.printStackTrace();}
				E.ac.withdraw(10);
				System.out.println(t.getName()+" Balance after transaction :"+i+" Balance: "+E.ac.balance);	
			}else{
				System.out.println("Insufficient Balance");
			}
		}
	}
}

class E{
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