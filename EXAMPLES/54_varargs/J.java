class J{
	static void pro(int x,int... y){
		System.out.println(x);

		for(int t : y){
			System.out.println(t+" ~");
		}
	}

	public static void main(String[] args){
		//pro(23,67,90,34,12);	
		//pro(23);
		pro();
	}
}