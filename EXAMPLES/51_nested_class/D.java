class D{
	//int r = 9;
	//or
	//static int r = 9;

	static void aaa(){
		System.out.println(r);
	}

	static class X{
		void pro(){
			aaa();
			System.out.println(r);
		}
	}
}