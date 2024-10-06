class MyRunnable implements Runnable{
	public void run(){
		System.out.println("#############################");
		System.out.println(Thread.currentThread().getName());
		System.out.println("#############################");
		try{Thread.sleep(100);}catch(InterruptedException e){e.printStackTrace();}
	}
}

class D{
	public static void main(String[] args){
		ThreadGroup tg = new ThreadGroup("Quad");	

		MyRunnable r = new MyRunnable();

		Thread t1 = new Thread(tg,r,"Japan");
		Thread t2 = new Thread(tg,r,"Bharat");
		Thread t3 = new Thread(tg,r,"Australia");
		Thread t4 = new Thread(tg,r,"US");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		Thread.currentThread().getThreadGroup().getParent().list();
		try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		Thread.currentThread().getThreadGroup().getParent().list();
	}
}