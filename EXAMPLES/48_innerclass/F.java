class F{
	class B{

	}

	void pro(){
		B x = new B();
	}

	public static void main(String[] args){		
		//Case 6:
		//B x = new B();
		
		//Case 5:
		//F f = new F();
		//f.pro();
			
		//Case 4:
		//B x = new F().new B();

		//Case 3:
		//F f = new F();
		//F.B x = f.new B();

		//Case 2:
		//F f = new F();
		//B x = f.new B();

		//Case 1:
		//B x;
	}
}