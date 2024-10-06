class A{
	public static void main(String[] args){
		process();
	}

	static void process(){
		try{
			int[] x = {12,45,67};

			System.out.println(x[3]);

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("Invalid index....");
			System.out.println("Enter a valid index: ");
			String str = System.console().readLine();
			int index = Integer.parseInt(str);
			//lots of code....
			System.out.println("++++++++++");
		}

		System.out.println("^^^^^^^^^^^^^^^");
	}
}