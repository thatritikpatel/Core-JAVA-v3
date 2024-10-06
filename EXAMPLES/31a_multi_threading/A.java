class AThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"---- start");
		try{A.t2.join();}catch(InterruptedException e){ e.printStackTrace();}
		System.out.println(Thread.currentThread().getName()+"---- end");
	}
}

class BThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"---- start");
		try{A.t1.join();}catch(InterruptedException e){ e.printStackTrace();}
		System.out.println(Thread.currentThread().getName()+"---- end");
	}
}

class A{
	static AThread t1;	
	static BThread t2;	

	public static void main(String[] args){
		t1 = new AThread();
		t2 = new BThread();

		t1.setName("A");
		t2.setName("B");

		t1.start();
		t2.start();
	}
}