class M{
	public static void main(String[] args){
		int[] x = {12,34,67,90,45,2,13};
		int[] y = {45,67,22,19};

		int[] z = new int[x.length+y.length];

		int j = 0;
		for(int i=0;i<z.length;i++){
			if(i<x.length)
				z[i] = x[i];
			else
				z[i] = y[j++];
		}

		for(int i=0;i<z.length;i++){
			System.out.println(z[i]);
		}
	}
}