class MyRunnable implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();
		for(int i=0;i<20;i++){
			System.out.println(i+" - "+t.getName());
		}
	}
}

class Y{
	public static void main(String[] args){
		Thread th = new Thread(new MyRunnable(),"A");
		th.start();

		try{
			th.join(80);
		}catch(InterruptedException e){
			e.printStackTrace();	
		}

		Thread t = Thread.currentThread();
		for(int i=0;i<20;i++){
			System.out.println(i+" - "+t.getName());
		}
	}
}