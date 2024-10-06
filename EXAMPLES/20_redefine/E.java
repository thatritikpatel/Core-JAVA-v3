class X{
	void pro(){
		System.out.println("pro in X");
	}
}

class E extends X{
	void pro(){
		System.out.println("pro in D");
	}
	
	public static void main(String[] args){
		X x = new E();
		x.pro(); //Dynamic Method Dispatch (Runtime Polymorphism)
	}
}