class C{
	public static void main(String[] args){
		char a = 't';
		byte b = 21;
		short c = 34;
		int d = 45;
		long e = 34L;
		float f = 2.34f;
		double g = 23.45;
		

		int[] x = {10,a,b,c,d,(int)e,(int)f,(int)g};

		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+"  ");
		}
	}
}