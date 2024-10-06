class D{
	public static void main(String[] args){
		System.out.println(process());
	}

	static int process(){
		try{
			return 12;					
		}finally{
			return 34;
		}

		//return 100;
	}
}