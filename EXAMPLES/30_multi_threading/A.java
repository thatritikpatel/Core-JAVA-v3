class A{
	public static void main(String[] args){
		Thread t = Thread.currentThread();

		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getPriority());

		System.out.println(t);
	}
}