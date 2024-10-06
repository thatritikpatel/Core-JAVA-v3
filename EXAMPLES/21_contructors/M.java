class Z{
	Z(){
		System.out.println("Z()");
	}
}

class Y extends Z{
	Y(){
		System.out.println("Y()");
	}
}

class X extends Y{
	X(){
		System.out.println("X()");
	}
}

class M{
	public static void main(String[] args){
		X j = new X();
	}
}