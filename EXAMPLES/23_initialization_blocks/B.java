class B{
	{
		System.out.println("init-block");	
	}

	public static void main(String[] args){
		System.out.println("method main start");		
		
		B x1 = new B();
		B x2 = new B();
		B x3 = new B();


		System.out.println("method main end");		
	}
}