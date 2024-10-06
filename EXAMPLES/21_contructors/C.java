class C{
	C(){
		System.out.println("inside C constructor...");
	}

	public static void main(String[] args){
		new C();
		new C();
		new C();
		new C();
	}
}