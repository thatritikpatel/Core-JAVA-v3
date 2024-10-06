class X{
	void pro(){
		System.out.println("$$$$$");
	}
}

class F{
	X t = new X(){
					void pro(){
						System.out.println("pro");
					}

					void aaa(){
						System.out.println("aaa");
					}
				 };

	public static void main(String[] args){
		F e = new F();
		e.t.pro();
		e.t.aaa();
	}
}