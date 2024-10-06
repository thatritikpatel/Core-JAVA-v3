class T1 extends Exception{
	public static void main(String[] args){
		
		//ArithmeticException ae = new ArithmeticException();
		//ClassNotFoundException ae = new ClassNotFoundException();
		//LinkageError ae = new LinkageError();
		//T1 ae = new T1();
		
		
		try{
			throw ae;
		}catch(Throwable e){
			System.out.println(e);
		}

	}
}