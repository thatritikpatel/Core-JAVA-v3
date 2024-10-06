class X{
	int u = 23;
}

class B extends X{
	int u = 34;
	
	public static void main(String[] args){
		X x = new B();
		System.out.println(x.u);
	}
}