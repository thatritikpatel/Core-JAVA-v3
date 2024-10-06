class V{
	void pro2(){
		System.out.println("####");
	}

	class X{
		void pro1(){
			//pro2();
			System.out.println("++++");
		}
	}

	public static void main(String[] args){
		V v = new V();
		X x = v.new X();
		//x.pro1();
		//x.pro2();//---NOT OK
		//v.pro2();
		//v.pro1();//---NOT OK
	}
}