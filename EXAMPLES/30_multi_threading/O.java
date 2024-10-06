class MyThread extends Thread{
	
	static Thread defaultThread;

	public void run(){
		try{ Thread.sleep(300); }catch(InterruptedException e){e.printStackTrace();}
		
		String threadName = Thread.currentThread().getName();
		for(int i=0;i<20;i++){
			System.out.println(i+" - "+threadName);		
		}

		System.out.println(defaultThread.getName()+" - "+defaultThread.isAlive());
	}
}

class O{
	public static void main(String[] args){
		MyThread.defaultThread = Thread.currentThread();

		MyThread t = new MyThread();
		t.setName("mohan");
		t.start();	

		String threadName = Thread.currentThread().getName();
		for(int i=0;i<5;i++){
			System.out.println(i+" - "+threadName);		
		}		
	}
}