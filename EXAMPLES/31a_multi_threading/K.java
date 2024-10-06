class MyRunnable implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();

		for(int i=0;i<20;i++){
			synchronized(this){
				System.out.println(i+" - "+t.getName());
			}
		}
	}
}

class K{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r,"A");
		Thread t2 = new Thread(r,"B");

		t1.start();
		t2.start();
	}
}