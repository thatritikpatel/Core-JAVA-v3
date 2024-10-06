class A{
	void pro(){
		System.out.println("pro in A");
	}
}

class B extends A{
	void pro(){
		System.out.println("pro in B");
	}
}

class T{
	public static void main(String[] args){
		//Case :
		A x = new B();
		x.pro();
		
		//Case 2:
		//B b = new B();
		//b.pro();
		
		//Case 1:
		//A a = new A();
		//a.pro();
	}
}