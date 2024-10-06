class Account{
	private int balance = 50;

	synchronized int getBalance(){
		return balance;
	}

	synchronized void withdraw(int amt){
		balance -= amt;
	}
}

class AccountThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		
		for(int i=0;i<5;i++){
			if(F.ac.getBalance()>=10){
				System.out.println(t.getName()+" going to withdraw money :"+i+" current balance: "+F.ac.getBalance());	
				try{Thread.sleep(1000);}catch(InterruptedException e){ e.printStackTrace();}
				F.ac.withdraw(10);
				System.out.println(t.getName()+" Balance after transaction :"+i+" Balance: "+F.ac.getBalance());	
			}else{
				System.out.println("Insufficient Balance");
			}
		}
	}
}

class F{
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