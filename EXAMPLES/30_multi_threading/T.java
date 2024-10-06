class MyRunnable implements Runnable{
	public void run(){
		String tname = Thread.currentThread().getName();
		for(int i=0;i<10;i++)
			System.out.println(i+" # "+tname);
	}
}

class T{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();

		Thread t1 = new Thread(r,"A");
		Thread t2 = new Thread(r,"B");

		t1.setPriority(1);
		t2.setPriority(10);

		t1.start();
		t2.start();


		String tname = Thread.currentThread().getName();
		for(int i=0;i<10;i++)
			System.out.println(i+" # "+tname);
	}
}