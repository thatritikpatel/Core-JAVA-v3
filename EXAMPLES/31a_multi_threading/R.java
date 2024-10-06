
class MyThread extends Thread{
	public void run(){
		R.x.pro1();
	}
}

class YourThread extends Thread{
	public void run(){
		R.x.pro2();
	}
}

class R{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.setName("A");

		YourThread t2 = new YourThread();
		t2.setName("B");

		t1.start();
		t2.start();
	}

	static R x = new R();

	synchronized static void pro1(){
		Thread t = Thread.currentThread();

		for(int i=0;i<20;i++){
			System.out.println(i+" - "+t.getName());
		}	
	}

	synchronized static void pro2(){
		Thread t = Thread.currentThread();

		for(int i=0;i<20;i++){
			System.out.println(i+" - "+t.getName());
		}	
	}	
}