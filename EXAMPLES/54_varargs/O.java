class O{
	O(int... x){
		System.out.println("+++++");
	}

	public static void main(String[] args){
		O x = new O();	
		O y = new O(12);	
		O z = new O(12,78,23);	
	}
}