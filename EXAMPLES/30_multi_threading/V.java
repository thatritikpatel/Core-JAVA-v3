class MyRunnable implements Runnable {
	public void run(){
		Thread thread = Thread.currentThread();

		for(int i=0;i<30;i++){
			System.out.println(i+" # "+thread.getName());
		}
	}
}

class V{
	public static void main(String[] args){
		new Thread(new MyRunnable(),"A").start();

		Thread thread = Thread.currentThread();

		for(int i=0;i<20;i++){
			if(i>11&&i<15){
				System.out.println(i+" # "+thread.getName()+" yielding");	
				Thread.yield();
			}
			System.out.println(i+" # "+thread.getName());
		}
	}
}