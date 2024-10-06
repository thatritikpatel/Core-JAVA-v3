class E{
	int a = 2;

	void pro(){
		System.out.println("pro in E");
	}

	class B{

	}

	public static void main(String[] args){
		E x = new E();
		
		//System.out.println(x.a);

		//x.pro();

		x.new B();
	}
}