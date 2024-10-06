class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+"-"+Thread.currentThread().getName());
		}
	}
}

class H{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();

		Thread t = new Thread(r);

		t.setName("A");

		t.start();

		for(int i=0;i<20;i++){
			System.out.println(i+"##"+Thread.currentThread().getName());
		}
	}
}