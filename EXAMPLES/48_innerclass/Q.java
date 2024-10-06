class Q{
	int w = 900;

	class A extends X{
		//int w = 90;

		void pro(){
			//int w = 9;
			System.out.println(w);
		}
	}
	
	public static void main(String[] args){
		Q p = new Q();
		A a = p.new A();
		a.pro();
	}
}



class X{
	//int w = 1;
}