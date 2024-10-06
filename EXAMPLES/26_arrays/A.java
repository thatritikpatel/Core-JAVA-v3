class A{
	public static void main(String[] args){
		String[][] x = new String[4][];

		x[0] = new String[3];
		x[1] = new String[2];
		x[2] = new String[4];
		x[3] = new String[5];

		x[0][0] = "a1";
		x[0][1] = "a2";
		x[0][2] = "a3";

		x[1][0] = "b1";
		x[1][1] = "b2";
		//x[1][2] = "b3";

		x[2][0] = "c1";
		x[2][1] = "c2";
		//x[2][2] = "c3";
		x[2][3] = "c4";

		x[3][0] = "d1";
		x[3][1] = "d2";
		x[3][2] = "d3";
		x[3][3] = "d4";
		x[3][4] = "d5";

		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+"  ");
			}
			System.out.println();
		}
	}
}