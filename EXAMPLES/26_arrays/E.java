class E{
	public static void main(String[] args){
		int[] x = {12,13,14,15,16};

		int[] y = new int[x.length];
		
		for(int i=0;i<x.length;i++){
			y[i] = x[x.length-i-1];
		}

		for(int i=0;i<x.length;i++){
			System.out.print(y[i]+" ");
		}
	}
}