class MyThread extends Thread{
	public void run(){
		String threadName = Thread.currentThread().getName();
		for(int i=0;i<20;i++){
			System.out.println(i+" - "+threadName);		
		}
	}
}

class N{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.setName("mohan");
		
		System.out.println(t.isAlive());

		t.start();

		System.out.println(t.isAlive());

		try{ Thread.sleep(300); }catch(InterruptedException e){e.printStackTrace();}

		String threadName = Thread.currentThread().getName();
		for(int i=0;i<5;i++){
			System.out.println(i+" - "+threadName);		
		}

		System.out.println(t.isAlive());
	}
}