class MyThread1 extends Thread{
	public void run(){
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+" ---- start-- "+thread.getPriority());
		
		MyThread2 t = new MyThread2();
		t.setName("B");
		System.out.println(t.getName()+" ##### "+t.getPriority());

		System.out.println(thread.getName()+" ---- end-- "+thread.getPriority());		
	}
}

class MyThread2 extends Thread{
	public void run(){
		
	}
}

class U{
	public static void main(String[] args){
		MyThread1 t1 = new MyThread1();
		t1.setName("A");
		//t1.setPriority(2);
		t1.setPriority(7);
		t1.start();
	}
}