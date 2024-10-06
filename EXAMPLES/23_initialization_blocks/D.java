class D{
	int x = 89;

	{
		System.out.println("init-block "+x);	
	}

	D(){
		super();
		//---x
		//---print
		System.out.println("constructor");	
	}

	public static void main(String[] args){
		System.out.println("main start");
		
		D x = new D();

		System.out.println("main end");
	}
}