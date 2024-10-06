class MyRunnable implements Runnable{
	public void run(){
		try{Thread.sleep(100);}catch(InterruptedException e){e.printStackTrace();}
	}
}

class C{
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

		//tg.list();

		Thread.currentThread().getThreadGroup().getParent().list();
	}
}