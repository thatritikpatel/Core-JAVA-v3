class X{
	{
		System.out.println("X-");
	}
}

class Q extends X{
	{
		System.out.println("O-");
	}

	public static void main(String[] args){
		System.out.println("main-");

		Q x = new Q();
	}
}

