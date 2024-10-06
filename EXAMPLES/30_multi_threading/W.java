class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		for(int i=0;i<20;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}

class W{
	public static void main(String[] args){
		MyThread th = new MyThread();
		th.setName("A");
		th.start();
	
		Thread t = Thread.currentThread();
		for(int i=0;i<20;i++){
			if(i==11){
				try{th.join();}catch(InterruptedException e){e.printStackTrace();}
			}

			System.out.println(i+" ~ "+t.getName());
		}
	}
}