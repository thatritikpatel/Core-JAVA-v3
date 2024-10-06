class X{
	static{	System.out.println("X-");	}
	{	System.out.println("E-");	}
	{	System.out.println("A-");	}
	static{	System.out.println("O-");	}
}

class R extends X{
	{	System.out.println("O-");	}
	static{	System.out.println("T-");	}
	{	System.out.println("S-");	}
	static{	System.out.println("M-");	}

	public static void main(String[] args){
		System.out.println("main-");

		R x = new R();
	}
}

