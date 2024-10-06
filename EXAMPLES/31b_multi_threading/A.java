class A{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		ThreadGroup tg = t.getThreadGroup();
		ThreadGroup ptg = tg.getParent();

		System.out.println("Current Thread Name: "+t.getName());
		System.out.println("Thread Group: "+tg.getName());
		System.out.println("Thread Group Parent: "+ptg.getName());

		ptg.list();
	}
}