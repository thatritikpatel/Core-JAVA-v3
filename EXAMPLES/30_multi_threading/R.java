class R{
	public static void main(String[] args){
		Thread thread = Thread.currentThread();

		System.out.println(thread.getPriority());

		//thread.setPriority(1);
		//thread.setPriority(7);
		//thread.setPriority(10);
		thread.setPriority(12);

		System.out.println(thread.getPriority());
	}
}