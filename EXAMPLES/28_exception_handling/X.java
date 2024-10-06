class X{
	public static void main(String[] args){
		//Case 2:
		//int a = 12/0;
				
		//Case 1:
		
		try{
			int a = 12/0;
		}catch(ArithmeticException e){
			//System.out.println(e);
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}