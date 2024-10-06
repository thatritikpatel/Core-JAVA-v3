class MyRunnable implements Runnable{
	public void run(){
		String tName = Thread.currentThread().getName();
		
		for(int i=0;i<20;i++){
			System.out.println(i+" # "+tName);
		}
	}
}

class K{
	public static void main(String[] args){

		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.setName("Golu");
		t.start();
		
		String tName = Thread.currentThread().getName();
		
		for(int i=0;i<20;i++){
			if(i==10){
				try{t.sleep(300);}catch(InterruptedException e){e.printStackTrace();}
			}
			System.out.println(i+" # "+tName);
		}
	}
}