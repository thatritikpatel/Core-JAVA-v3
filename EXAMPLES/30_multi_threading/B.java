class MyThread extends Thread{
	public void run(){
		//-----
	}
}

class B{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();
	}
}