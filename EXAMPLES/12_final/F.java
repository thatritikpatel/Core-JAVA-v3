class X{
	void pro(){
		System.out.println("Hello");
	}
}

class F extends X{
	/*
	void pro(){
		System.out.println("Hi");
	}*/

	public static void main(String[] args){
		F f = new F();

		//f.abc();
		f.pro();
	}
}