class MyThread extends Thread{
	public void run(){
		String threadName = Thread.currentThread().getName();
		//Job 2:
		for(int i=0;i<30;i++){
			System.out.println(threadName+"_Job2_"+i);
		}
	}
}

class D{
	public static void main(String[] args){
		String threadName = Thread.currentThread().getName();

		MyThread t = new MyThread();
		t.setName("-A-");
		t.start();

		//Job 1:
		for(int i=0;i<30;i++){
			System.out.println(threadName+"_Job1_"+i);
		}	
	}
}