class AThread extends Thread{
	public void run() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"---- start");
		Z.t2.join();
		System.out.println(Thread.currentThread().getName()+"---- end");
	}
}

class BThread extends Thread{
	public void run() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"---- start");
		Z.t1.join();
		System.out.println(Thread.currentThread().getName()+"---- end");
	}
}

class Z{
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