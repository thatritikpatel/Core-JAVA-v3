class P{
	public static void main(String[] args){
		int[] x = {34,67,23,90,44,19};

		for(int i=0;i<x.length;i++){
			if(x[i]%2==0){
				System.out.println(x[i]+" is even");
			}else{
				System.out.println(x[i]+" is odd");
			}
		}
	}
}