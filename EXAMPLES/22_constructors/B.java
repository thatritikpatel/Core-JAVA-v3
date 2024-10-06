class B{
	B(){
		this(12);
		System.out.println("B ----");
	}

	B(int y){
		this();

		System.out.println("A ----");
	}

	public static void main(String[] args){
		System.out.println("statr ----");
		
		B x = new B();

		System.out.println("end ----");
	}
}