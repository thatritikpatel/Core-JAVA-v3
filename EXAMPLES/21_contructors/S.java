class X{
	X(int y){
		System.out.println("S");
	}
}

class S extends X{
	S(){
	
	}

	public static void main(String[] args){
		System.out.println("W");
		S t = new S();
		System.out.println("I");
	}
}