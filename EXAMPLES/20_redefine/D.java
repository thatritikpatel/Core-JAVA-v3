class X{
	static void pro(){
		System.out.println("pro in X");
	}
}

class D extends X{
	static void pro(){
		System.out.println("pro in D");
	}
	
	public static void main(String[] args){
		X x = new D();
		x.pro();
	}
}