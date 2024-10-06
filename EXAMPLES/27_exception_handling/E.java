class E{
	public static void main(String[] args){
		System.out.println("--- 1");
		
		try{
			System.out.println("--- 2");
			int x = 23/0;
			System.out.println("--- 3");
		}catch(ArithmeticException e){
			System.out.println("AE");	
		}

		System.out.println("--- 4");
	} 
}