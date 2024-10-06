class X{
	void pro(){
		System.out.println("pro method");
	}
}

class C extends X{
	public static void main(String[] args){
		C x = new C();

		x.add();
		x.pro();
		System.out.println(x.hashCode());
		System.out.println(x.toString());
	}

	void add(){
		System.out.println("add method");
	}
}