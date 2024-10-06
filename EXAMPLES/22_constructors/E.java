class X{
	X(){
		System.out.println("X constructor");
	}
}

abstract class Y extends X{
	final int t;

	t = 90;

	Y(){
		
		System.out.println("Y constructor");
	}
}

class E extends Y{
	E(){
		System.out.println("E constructor");
	}

	public static void main(String[] args){
		E e = new E();
		System.out.println(e.t);
	}
}