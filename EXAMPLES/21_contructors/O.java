class A{
	int x;
}

class B extends A{
	float y = 5.67f;
}

class C extends B{
	boolean j;	
}

class O{
	public static void main(String[] args){
		C t = new C();
		
		System.out.println(t.j);
		System.out.println(t.y);
		System.out.println(t.x);
	}
}