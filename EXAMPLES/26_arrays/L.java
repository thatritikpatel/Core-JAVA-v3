class L{
	public static void main(String[] args){
		int[][][] x = new int[2][][];

		x[0] = new int[3][];

		x[1] = new int[2][];

		x[0][0] = new int[2];
		x[0][1] = new int[3];
		x[0][2] = new int[2];

		x[1][0] = new int[4];
		x[1][1] = new int[2];

		x[0][0][0] = 12;
		x[0][0][1] = 13;

		x[0][1][0] = 22;
		x[0][1][1] = 23;
		x[0][1][2] = 24;

		x[0][2][0] = 32;
		x[0][2][1] = 33;

		x[1][0][0] = 42;
		x[1][0][1] = 43;
		x[1][0][2] = 44;
		x[1][0][3] = 45;

		x[1][1][0] = 52;
		x[1][1][1] = 53;
		
		//System.out.println(x);
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				for(int k=0;k<x[i][j].length;k++){
					System.out.print(x[i][j][k]+" ");
				}
				System.out.print(" ~ ");
			}
			System.out.println();
		}
	}
}