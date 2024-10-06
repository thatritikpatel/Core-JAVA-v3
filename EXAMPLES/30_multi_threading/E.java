class E{
	public static void main(String[] args){
		AThread a = new AThread();
		a.start();

		BThread b = new BThread();
		b.start();


		String threadName = Thread.currentThread().getName();

		for(int i=0;i<20;i++){
			System.out.println(threadName+"-"+i);
		}
	}
}

class AThread extends Thread{
	public void run(){
		String threadName = Thread.currentThread().getName();

		for(int i=0;i<20;i++){
			System.out.println(threadName+" ~ "+i);
		}
	}
}

class BThread extends Thread{
	public void run(){
		String threadName = Thread.currentThread().getName();

		for(int i=0;i<20;i++){
			System.out.println(threadName+" ~ "+i);
		}
	}
}