class N{
	public static void main(String[] args){
		String[][] x = {
							{"a1","a2","a3","a4","a5"},
							{"c1","c2","c3"},
							{"b1","b2","b3","b4","b5","b6","b7"},
							{"d1","d2","d3","d4"}
						};

		
		String[][] y = new String[x.length][];

		//Case 1:
		/*
		for(int i=0;i<x.length;i++){
			y[i] = new String[x[x.length-i-1].length];
			for(int j=0;j<x[x.length-i-1].length;j++){
				y[i][j] = x[x.length-i-1][x[x.length-i-1].length-j-1];
			}
		}*/		

		//Case 2:
		/*
		for(int i=0;i<x.length;i++){
			String[] k = x[x.length-i-1];
			y[i] = new String[k.length];
			for(int j=0;j<k.length;j++){
				y[i][j] = k[k.length-j-1];
			}
		}*/
		
		//Case 3:
		/*
		for(int i=0;i<x.length;i++){
			y[i] = new String[x[x.length-i-1].length];
			for(int j=0;j<y[i].length;j++){
				y[i][j] = x[x.length-i-1][y[i].length-j-1];
			}
		}*/

		
		for(int i=0;i<y.length;i++){
			for(int j=0;j<y[i].length;j++){
				System.out.print(y[i][j]+"  ");
			}
			System.out.println();
		}		
	}
}