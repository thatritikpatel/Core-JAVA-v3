class U{
	public static void main(String[] args){
		int[] x = {12,10,78,42,36,98,55,34,67,45,22};

		int max = x[0]; 

		for(int i=0;i<x.length;i++){
			if(x[i] > max){
				max = x[i];
			}
		}

		System.out.println(max);
	}
}