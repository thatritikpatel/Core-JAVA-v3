class AThread extends Thread{
	public void run(){
		new Y().pro();
	}
}


class BThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		
		synchronized(Y.class){
			for(int i=0;i<20;i++){
				System.out.println(i+" - "+t.getName());
			}
		}	
	}
}

class N{
	public static void main(String[] args){
		AThread t1 = new AThread();
		t1.setName("A");
		BThread t2 = new BThread();
		t2.setName("B");

		t1.start();
		t2.start();
	}
}

class Y{
	synchronized void pro(){
		Thread t = Thread.currentThread();
		
		for(int i=0;i<20;i++){
			System.out.println(i+" - "+t.getName());
		}
	}
}