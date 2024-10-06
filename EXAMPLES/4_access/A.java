class A{
	public static void main(String[] args){
		//Case 1:
		//B x;

		//Case 2:
		//B x = new B();

		//Case 3:
		B x = new B();
		System.out.println(x.y);
		x.process();
	}
}

class B{
	int y = 19;

	void process(){
		System.out.println("Hello.. Corona");
	}
}