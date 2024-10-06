class C{
	{
		System.out.println("init-block");	
	}

	C(){
		super();
		//---
		System.out.println("constructor");	
	}

	public static void main(String[] args){
		System.out.println("main start");
		
		C x = new C();

		System.out.println("main end");
	}
}