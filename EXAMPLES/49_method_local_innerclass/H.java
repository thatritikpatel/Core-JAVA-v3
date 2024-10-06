class H{
	void pro(){
		class X{
			private void aaa(){
				System.out.println("++++###++++");
			}
		}

		X e = new X();
		e.aaa();
	}

	public static void main(String[] args){ 
		H h = new H();
		h.pro();
	}
} 