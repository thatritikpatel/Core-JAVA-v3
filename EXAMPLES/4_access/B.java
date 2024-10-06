class A extends B{
	public static void main(String[] args){
		A a = new A();

		System.out.println(a.y);
		a.process();
	}
}

class B{
	int y = 34;

	void process(){
		System.out.println("Hello");
	}
}