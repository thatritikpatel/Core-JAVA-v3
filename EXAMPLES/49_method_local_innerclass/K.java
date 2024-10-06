class K{
	int w = 4;

	static void pro(){
		class X{
			void aaa(){
				System.out.println(w);
			}
		}

		X t = new X();
		t.aaa();
	}

	public static void main(String[] args){
		pro();
	}
}