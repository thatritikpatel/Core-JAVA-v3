class E{
	public static void main(String[] args){
		process();
	}

	static void process(){
		try{
			throw new NullPointerException();							
		}finally{
			throw new ArithmeticException();
		}
	}
}