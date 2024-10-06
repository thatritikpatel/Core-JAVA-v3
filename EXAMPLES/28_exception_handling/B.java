class B{
	static int i = 0;

	public static void main(String[] args){
		try{
			pro();
		}catch(StackOverflowError e){
			System.out.println("######################");	
			System.out.println("######################");	
			System.out.println("######################");	
			System.out.println("######################");	
		}
	}

	static void pro(){
		System.out.println(i++);
		pro();
	}
}