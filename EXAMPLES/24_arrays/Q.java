class Q{
	public static void main(String[] args){
		int[] x = {34,67,23,90,44,19};

		int sum = 0;

		for(int i=0;i<x.length;i++){			
			if(x[i]%2!=0){
				sum = sum + x[i];
			}
		}
		
		System.out.println(sum);
	}
}