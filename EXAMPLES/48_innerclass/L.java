class L{
	int a = 23;

	void abc(){
		System.out.println("abc defined in Outer class L");
	}

	class A{
		void pro(){
			System.out.println(a);
			abc();
		}
	}

	public static void main(String[] args){
		L x = new L();

		A y = x.new A();

		y.pro();
	}
}