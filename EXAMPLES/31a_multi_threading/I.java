class I{
	private int x = 10;

	public static void main(String[] args){
		System.out.println("-----1");

		I i = new I();
		i.pro();

		System.out.println("-----2");
	}

	/*synchronized*/ void pro(){
		System.out.println("-----3");

		synchronized(this){
			x = 90;
		}

		System.out.println("-----4");
	}
}