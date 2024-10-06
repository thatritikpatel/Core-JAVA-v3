class B{
	static int w = 90;

	static void pro(){
		System.out.println("++");
	}

	static class X{

	}

	public static void main(String[] args){
		System.out.println(w);

		pro();

		X t = new X();
	}
}