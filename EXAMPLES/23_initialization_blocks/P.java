class X{
	{
		System.out.println("X-");
	}
}

class P{
	{
		System.out.println("O-");
	}

	public static void main(String[] args){
		System.out.println("main-");

		P x = new P();
	}
}

