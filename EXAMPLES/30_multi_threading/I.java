class MyThread extends Thread {
	public void run(int e){
		System.out.println("Hello");
	}
}

class I{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();

		System.out.println("Hi");
	}
}