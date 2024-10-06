class B{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		ThreadGroup tg = t.getThreadGroup();
		ThreadGroup ptg = tg.getParent();

		System.out.println(ptg.activeCount());
		
		ptg.list();
	}
}