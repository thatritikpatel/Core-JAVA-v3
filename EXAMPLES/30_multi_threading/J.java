class MyRunnable implements Runnable{
	public void run(){
		String threadName = Thread.currentThread().getName();

		for(int i=0;i<20;i++){
			System.out.println(i+" - "+threadName);
		}
	}
}

class J{
	public static void main(String[] args){
		new Thread(new MyRunnable(),"A").start();

		String threadName = Thread.currentThread().getName();

		for(int i=0;i<20;i++){
			if(i==10){
				try{Thread.sleep(300);}catch(InterruptedException e){e.printStackTrace();}			
			}
			System.out.println(i+" - "+threadName);
		}
	}
}