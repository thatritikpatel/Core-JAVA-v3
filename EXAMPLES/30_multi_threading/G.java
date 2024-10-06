class MyThread extends Thread{
	public void run(){
		System.out.print(Thread.currentThread().getName());
	}
}

class G{
	public static void main(String[ ] args){
		
		MyThread t = new MyThread();
		t.setName("Mohan");
		
		//Case 1:
		//t.run();

		//Case 2:
		t.start();

		System.out.print(Thread.currentThread().getName());
	}
}