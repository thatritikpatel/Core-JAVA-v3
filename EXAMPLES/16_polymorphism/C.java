class A{
	void abc(){
		System.out.println("method abc() in class A");
	}
}

class B extends A{
	void mno(){
		System.out.println("method mno() in class B");
	}
}

class C extends B{
	void pqr(){
		System.out.println("method pqr() in class C");
	}
}

class X{
	public static void main(String[] args){
		//Case 4:
		Object x = new C();
		//x.pqr();
		//x.mno();
		//x.abc();
		System.out.println(x.toString());
		
		
		//Case 3:
		/*
		A x = new C();
		//x.pqr();
		//x.mno();
		x.abc();
		System.out.println(x.toString());
		
		//Case 2:
		/*
		B x = new C();
		//x.pqr();
		x.mno();
		x.abc();
		System.out.println(x.toString());
		*/


		//Case 1:
		/*
		C x = new C();
		x.pqr();
		x.mno();
		x.abc();
		System.out.println(x.toString());
		*/
	}
}