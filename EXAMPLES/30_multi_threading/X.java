class MyThread extends Thread{
	public void run(){
		YourThread th = new YourThread();
		th.setName("B");
		th.start();

		try{th.join();}catch(InterruptedException e){e.printStackTrace();}

		Thread t = Thread.currentThread();
		for(int i=0;i<5;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}

class YourThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		for(int i=0;i<5;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}

class X{
	public static void main(String[] args){
		MyThread th = new MyThread();
		th.setName("A");
		th.start();

		//try{th.join();}catch(InterruptedException e){e.printStackTrace();}
	
		Thread t = Thread.currentThread();
		for(int i=0;i<5;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}