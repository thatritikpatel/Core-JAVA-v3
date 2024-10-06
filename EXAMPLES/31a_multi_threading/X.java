
class AThread extends Thread{
	public void run(){
		BThread x = new BThread();
		x.setName("Kalia");
		x.start();

		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" - "+t.isDaemon());
	}
}

class BThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" - "+t.isDaemon());
	}
}

class X{
	public static void main(String[] args){
		AThread x = new AThread();
		x.setName("Golu");
		x.setDaemon(true);
		x.start();

		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" - "+t.isDaemon());
	}
}