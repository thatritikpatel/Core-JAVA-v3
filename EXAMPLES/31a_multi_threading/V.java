class AThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();

		for(int i=0;i<350;i++){
			System.out.println(i+"~"+t.getName());
		}
	}
}

class V{
	public static void main(String[] args){
		AThread t = new AThread();
		t.setName("Golu");
		t.setDaemon(true);
		t.start();

		Thread th = Thread.currentThread();

		for(int i=0;i<30;i++){
			System.out.println(i+"~"+th.getName());
		}
	}
}