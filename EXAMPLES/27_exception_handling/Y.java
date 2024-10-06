class Y{
	public static void main(String[] args){
		A.abc();
	}
}

class A{	
	static void abc(){
		B.mno();
	}
}

class B{
	static void mno(){
		C.pqr();
	}
}

class C{
	static void pqr(){
		String str = null;
		System.out.println(str.length());
	}
}