class F{
	void pro(){
		class X{
			void aaa(){
				System.out.println("aaa in X");
			}
		}

		X t = new X();
		t.aaa();
	}

	public static void main(String[] args){
		F f = new F();
		f.pro();
	}
}