class I{
	private int e = 90;
	
	void pro(){
		class X{
			void aaa(){
				System.out.println(e);
			}
		}

		X r = new X();
		r.aaa();
	}

	public static void main(String[] args){
		I i = new I();
		i.pro();
	}
}