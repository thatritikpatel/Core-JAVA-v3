class W{
	public static void main(String[] args){
		String[] x = new String[3];


		String[][] y = new String[4][3];

		y[2][1] = "om";
		y[1][2] = "ganesh";
		y[3][1] = "tim";
		
		for(int i=0;i<y.length;i++){
			for(int j=0;j<y[i].length;j++){
				//System.out.print("("+i+","+j+")\t");
				System.out.print(y[i][j]+"\t");
			}
			System.out.println();
		}
	}
}


