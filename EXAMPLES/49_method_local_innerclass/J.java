class J{
	private static int e = 90;
	
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
		J i = new J();
		i.pro();
	}
}