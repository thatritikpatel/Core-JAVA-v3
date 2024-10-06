class X{
	X(int y){
		System.out.println("S");
	}
}

class R extends X{
	public static void main(String[] args){
		System.out.println("W");
		R t = new R();
		System.out.println("I");
	}
}