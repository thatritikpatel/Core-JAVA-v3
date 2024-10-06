class X{
	public static void main(String[] args){
		abc();
	}

	static void abc(){
		mno();
	}

	static void mno(){
		pqr();
	}

	static void pqr(){
		String str = null;
		System.out.println(str.length());
	}
}