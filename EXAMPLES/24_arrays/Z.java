class Z{
	public static void main(String[] args){
		int[] x = {10,20,30,40,50,60,70};
		//int[] x = {12,34,56,78,21,90};
		//int t;

		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+"\t");
		}

		System.out.println("\n#######################");
		
		for(int i=0;i<x.length/2;i++){
			x[i] = x[i] + x[x.length-i-1];
			x[x.length-i-1] = x[i] - x[x.length-i-1];
			x[i] = x[i] - x[x.length-i-1];
		}

		System.out.println("\n#######################");

		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+"\t");
		}
	}
}