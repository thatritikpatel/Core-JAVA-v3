class E{	
	E(int y){
		System.out.println("hello");
	}

	public static void main(String[] args){
		System.out.println("start");
		
		//Case 1:
		//E e = new E();
		
		//Case 2:
		E e = new E(34);
		System.out.println("end");
	}
}