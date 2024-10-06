class R extends Y{
	//int w = 900;

	class A extends X{
		//int w = 90;

		void pro(){
			//int w = 9;
			System.out.println(w);
		}
	}
	
	public static void main(String[] args){
		R p = new R();
		A a = p.new A();
		a.pro();
	}
}

class Y{
	int w = -1;
}


class X{
	//int w = 1;
}