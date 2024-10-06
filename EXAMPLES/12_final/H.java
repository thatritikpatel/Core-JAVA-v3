class X{
	final void abc(){
		System.out.println("Hello");	
	}

	void mno(){
		System.out.println("Hi");
	}

	void pqr(){
		System.out.println("Good Morning");
	}
}

class H extends X{
	/*
	void abc(){
		System.out.println("HaHaHa");
	}*/

	public static void main(String[] args){
		H h = new H();
		
		h.abc();
		h.mno();
		h.pqr();
	}
}