class P{
	//int w = 900;

	class A{
		//int w = 90;

		void pro(){
			//int w = 9;
			System.out.println(w);
		}
	}
	
	public static void main(String[] args){
		P p = new P();
		A a = p.new A();
		a.pro();
	}
}