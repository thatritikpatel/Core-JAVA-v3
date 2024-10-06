class U{
	int x = 1;

	class A1{
		int x = 10;

		class B1{
			int x = 100;

			class C1{
				int x = 1000;
				
				void pro(){
					//System.out.println(x);
					//System.out.println(this.x);
					//System.out.println(B1.this.x);
					//System.out.println(A1.this.x);
					//System.out.println(U.this.x);
				}
			}
		}
	}

	public static void main(String[] args){
		U u = new U();

		U.A1 a = u.new A1();

		U.A1.B1 b = a.new B1();
	
		U.A1.B1.C1 c = b.new C1();

		c.pro();
	}
}