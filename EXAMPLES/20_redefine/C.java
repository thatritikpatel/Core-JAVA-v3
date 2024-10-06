class X{
	static int u = 45;
}

class C extends X{
	static int u = 56;
	
	public static void main(String[] args){
		X x = new C();
		System.out.println(x.u);
	}
}