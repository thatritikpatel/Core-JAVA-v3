class AThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();

		try{Thread.sleep(100);}catch(InterruptedException e){ e.printStackTrace();}


		ThreadGroup tg = t.getThreadGroup();
		System.out.println("++++"+t.getName()+" ++ "+tg.getName());
	}
}

class Z{
	public static void main(String[] args){
		Thread x = new AThread();
		x.setName("A");
		x.start();
		
		Thread t = Thread.currentThread();
		ThreadGroup tg = t.getThreadGroup();
		System.out.println("Thread Name: "+t.getName()+" ++ Thread Group Name: "+tg.getName());

		tg.list();
	}
}