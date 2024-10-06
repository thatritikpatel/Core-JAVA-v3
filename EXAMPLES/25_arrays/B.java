class B{
	public static void main(String[] args){
		char a = 't';
		byte b = 21;
		short c = 34;
		int d = 45;
		//float e = 2.34f;
		long e = 34L;

		int[] x = {10,a,b,c,d,e};

		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+"  ");
		}
	}
}