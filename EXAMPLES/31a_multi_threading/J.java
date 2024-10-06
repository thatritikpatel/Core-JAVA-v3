class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();

		for(int i=0;i<20;i++){
			synchronized(this){
				System.out.println(i+" - "+t.getName());
			}
		}
	}
}

class J{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.setName("A");

		MyThread t2 = new MyThread();
		t2.setName("B");

		t1.start();
		t2.start();
	}
}