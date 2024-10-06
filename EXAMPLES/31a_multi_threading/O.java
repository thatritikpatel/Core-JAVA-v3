class MyThread extends Thread{
	public void run(){
		O.x.pro1();
	}
}

class YourThread extends Thread{
	public void run(){
		O.x.pro2();
	}
}

class O{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.setName("A");

		YourThread t2 = new YourThread();
		t2.setName("B");

		t1.start();
		t2.start();
	}

	static O x = new O();

	void pro1(){
		Thread t = Thread.currentThread();

		for(int i=0;i<20;i++){
			System.out.println(i+" - "+t.getName());
		}	
	}

	void pro2(){
		Thread t = Thread.currentThread();

		for(int i=0;i<20;i++){
			System.out.println(i+" - "+t.getName());
		}	
	}	
}