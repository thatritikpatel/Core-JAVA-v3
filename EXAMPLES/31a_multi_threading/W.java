class W{
	public static void main(String[] args){
		Thread t = Thread.currentThread();

		t.setDaemon(true); //IllegalThreadStateException
	}
}