class G{
	int a = 8;

	void pro(){
		System.out.println("Hello");
	}

	class B{

	}

	void abc(){
		//System.out.println(a);
		//System.out.println(this.a);

		//pro();
		//this.pro();

		//new B();
		//this.new B();
	}

	public static void main(String[] args){
		G g = new G();	
		g.abc();
	}
}