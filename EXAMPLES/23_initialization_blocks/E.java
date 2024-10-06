class E{
	//int x = 89;

	{
		System.out.println("init-block "+x);	
	}

	int x = 89;

	E(){
		super();
		//--print
		//---x
		System.out.println("constructor");	
	}

	public static void main(String[] args){
		System.out.println("main start");
		
		E x = new E();

		System.out.println("main end");
	}
}