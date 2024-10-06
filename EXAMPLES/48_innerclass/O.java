class O{
	class A{
		private int e = 8;

		private void pro(){
			System.out.println("Hello Ji");
		}
	}

	public static void main(String[] args){
		O x = new O();
		A y = x.new A();
		y.pro();
		System.out.println(y.e);
	}
}