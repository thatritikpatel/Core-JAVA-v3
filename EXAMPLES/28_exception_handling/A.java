class A{
	static int i = 0;

	public static void main(String[] args){
		pro();
	}

	static void pro(){
		System.out.println(i++);
		pro();
	}
}