class P{
	static void pro(int... x){
		for(int t : x){
			System.out.println(t);
		}
	}

	public static void main(String... args){
		char a = 'A';
		byte b = 23;
		short c = 456;
		int d = 34;
		long e = 45L;
		float f = 4.56f;
		double g = 3.02;

		//pro(a);
		//pro(a,b);
		//pro(a,b,c);
		//pro(a,b,c,d);
		//pro(a,b,c,d,e);
		//pro(a,b,c,d,(int)e);
		pro(a,b,c,d,(int)e,(int)f,(int)g);
	}
}