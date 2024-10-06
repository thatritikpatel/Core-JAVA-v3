class A{
	public static void main(String[] args){
		char a = 't';
		byte b = 21;
		short c = 34;
		int d = 45;

		int[] x = {10,a,b,c,d};

		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+"  ");
		}
	}
}