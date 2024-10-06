class S{
	public static void main(String[] args){
		int[] x = {12,34,7,42,23};
		
		int ln = x.length;

		int[] y = new int[ln];

		for(int i=0;i<ln;i++){
			y[i] = x[i];
		}

		for(int i=0;i<ln;i++){
			System.out.println(y[i]);
		}				
	}
}