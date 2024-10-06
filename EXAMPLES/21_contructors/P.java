class A{
	int x;
}

class B extends A{
	float y = 5.67f;
	B(){
		//super();
		//float y = 5.67;

		//System.out.println(j);
		System.out.println(y);
		System.out.println(x);
	}
}

class C extends B{
	boolean j;	
	C(){
		//super();
		//boolean j = false; 
		//System.out.println(j);
		//System.out.println(y);
		//System.out.println(x);
	}
}

class P{
	public static void main(String[] args){
		C t = new C();
	}
}