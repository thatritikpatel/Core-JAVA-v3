class B{
	public static void main(String[] args) throws InterruptedException{
		Thread t = Thread.currentThread();

		System.out.println("start");
		t.join();
		System.out.println("end");
	}
}