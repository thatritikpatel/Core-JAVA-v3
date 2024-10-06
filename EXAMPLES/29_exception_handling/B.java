class B{
	public static void main(String[] args){
		process();
	}

	static void process(){
		try{
			System.out.print("Enter a number: ");
			int a = new java.util.Scanner(System.in).nextInt();
			int x = 12/a;
			System.out.println("Output: "+x);
		}catch(ArithmeticException e){
			throw new IllegalArgumentException();
			//re-Throwing Exception
		}

		System.out.println("All is well...");
	}
}