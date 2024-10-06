class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}

class F{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.setName("Bholu");

		t.start();

		t.start();//IllegalThreadStateException
 	}
}