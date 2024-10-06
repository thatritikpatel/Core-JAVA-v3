class E{
	static void pro(int... a){
		System.out.println(a);
		System.out.println(a.length);
	}
	
	public static void main(String[] args){
		//pro();
		//pro(56);
		//pro(12,56,34,89,23);
		pro(new int[]{12,56,34,89,23,92});
	}
}