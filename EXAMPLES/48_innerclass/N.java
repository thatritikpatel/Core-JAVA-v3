class N{
	private int w = 111;

	private void abc(){
		System.out.println("abc() in outer class N");
	}

	class A{
		void pro(){
			System.out.println(w);
			abc();
		}
	}

	public static void main(String[] args){
		N n = new N();
		A a = n.new A();
		a.pro();
	}
}