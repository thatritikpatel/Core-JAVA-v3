class Q{
	public static void main(String[] args){
		Thread defaultThread = Thread.currentThread();
		System.out.println(defaultThread.getPriority());
	}
}