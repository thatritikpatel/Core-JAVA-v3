class E{
	private static int y = 99;

	static class X{
		void pro(){
			System.out.println(y);
		}
	}

	public static void main(String[] args){
		X t = new X();
		t.pro();
	}
}