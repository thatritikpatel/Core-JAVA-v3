class F{
	static void pro(int... a){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ~~~");
		}

		//Case 1:
		/*
		for(int tmp : a){
			System.out.println(tmp);
		}*/
	}
	
	public static void main(String[] args){
		//pro();
		//pro(56);
		//pro(12,56,34,89,23);
		pro(new int[]{4,19,23,5,10,92});
	}
}