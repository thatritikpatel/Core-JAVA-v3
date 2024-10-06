class T{
	public static void main(String[] args){
		
		//ArithmeticException ae = new ArithmeticException();
		//ClassNotFoundException ae = new ClassNotFoundException();
		//LinkageError ae = new LinkageError();
		//T ae = new T();
		//String ae = new String("om");
		//Throwable ae = new Throwable();
		//Exception ae = new Exception();
		Error ae = new Error();
		
		try{
			throw ae;
		}catch(Throwable e){
			System.out.println(e);
		}

	}
}