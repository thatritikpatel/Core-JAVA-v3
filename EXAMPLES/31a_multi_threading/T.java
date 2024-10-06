class AThread extends Thread{
	public void run(){
		synchronized(X.class){
			try{Thread.sleep(100);}catch(InterruptedException e){ e.printStackTrace(); }
			synchronized(Y.class){
				System.out.println("Hello");
			}
		}	
	}
}

class BThread extends Thread{
	public void run(){
		synchronized(Y.class){
			try{Thread.sleep(100);}catch(InterruptedException e){e.printStackTrace();}
			synchronized(X.class){
				System.out.println("Bye");
			}
		}
	}
}

class T{
	public static void main(String[] args){
		AThread t1 = new AThread();
		BThread t2 = new BThread();

		t1.setName("A");
		t2.setName("B");

		t1.start();
		t2.start();
	}
}

class X{ }
class Y{ }
