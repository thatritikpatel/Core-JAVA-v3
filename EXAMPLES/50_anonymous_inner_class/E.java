class X{
	void pro(){
		System.out.println("$$$$$");
	}
}

class E{
	X t = new X(){
					void pro(){
						System.out.println("~~~~~~~~~~~$$$$$~~~~~~~~~~~~~");
					}
				 };

	public static void main(String[] args){
		E e = new E();
		e.t.pro();
	}
}