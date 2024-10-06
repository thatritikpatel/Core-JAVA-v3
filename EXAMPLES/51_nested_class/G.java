class G{
	static class X{
		static int y = 90;

		static void pro(){
			System.out.println("Hello");
		}
	}

	public static void main(String[] args){
		X t = new X();

		System.out.println(t.y);

		t.pro();
	}
}