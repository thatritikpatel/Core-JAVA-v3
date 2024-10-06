class AThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		
		synchronized(M.x){
			for(int i=0;i<20;i++){
				System.out.println(i+" - "+t.getName());
			}
		}
	}
}

class M{
	static X x = new X();

	public static void main(String[] args){
		AThread t1 = new AThread();
		t1.setName("A");
		
		AThread t2 = new AThread();
		t2.setName("B");
		
		
		t2.start();
		t1.start();
		
	}
}

class X{

}