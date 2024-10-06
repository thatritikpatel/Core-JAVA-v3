class M{
	int a = 3;

	class A{
		void pro(){
			System.out.println(a);
		}
	}

	public static void main(String[] args){
		M m1 = new M();
		m1.a = 12;
		A x1 = m1.new A();

		M m2 = new M();
		m2.a = 17;
		A x2 = m2.new A();

		x1.pro();
		x2.pro();
	}
}