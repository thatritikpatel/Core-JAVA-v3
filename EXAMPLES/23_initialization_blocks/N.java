class X{
	static{
		System.out.println("X-");
	}
}

class N extends X{
	static{
		System.out.println("N-");
	}

	public static void main(String[] args){
		System.out.println("main");
	}
}