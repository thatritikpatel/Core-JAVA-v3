class AThread extends Thread{
	public void run(){
		S.x.pro1();
	}
}

class BThread extends Thread{
	public void run(){
		S.y.pro2();
	}
}

class S{
	static X x = new X();
	static Y y = new Y();

	public static void main(String[] args){
		AThread t1 = new AThread();
		BThread t2 = new BThread();

		t1.setName("A");
		t2.setName("B");

		t1.start();
		t2.start();
	}
}

class X{
	synchronized void pro1(){
		try{Thread.sleep(100);}catch(InterruptedException e){e.printStackTrace();}
		S.y.pro2();
	}
}

class Y{
	synchronized void pro2(){
		try{Thread.sleep(100);}catch(InterruptedException e){e.printStackTrace();}
		S.x.pro1();
	}
}