class N{
	public static void main(String... args){
		int[] x = {1,45,23};

		//int[] y = (int[])x;
		int[] y = (int...)x;
	}
}