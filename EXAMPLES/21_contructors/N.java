class Z{
	Z(){
		super();
		System.out.println("Z()");
	}
}

class Y extends Z{
	Y(){
		super();
		System.out.println("Y()");
	}
}

class X extends Y{
	X(){
		super();
		System.out.println("X()");
	}
}

class N{
	public static void main(String[] args){
		X j = new X();
	}
}