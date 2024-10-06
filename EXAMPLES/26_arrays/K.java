class K{
	public static void main(String[] args){
		String[][] x = {
							{"a1","a2","a3","a4","a5"},
							{"b1","b2","b3","b4","b5","b6","b7"},
							{"c1","c2","c3"},							
							{"d1","d2","d3","d4"}
						};
		
		String[][] y = new String[x.length][];
		
		
		for(int i=0;i<y.length;i++){
			y[i] = new String[x[x.length-i-1].length];
			for(int j=0;j<y[i].length;j++){
				y[i][j] = x[x.length-i-1][j];
			}
		}
		

		
		
		
		for(int i=0;i<y.length;i++){
			for(int j=0;j<y[i].length;j++){
				System.out.print(y[i][j]+"  ");
			}
			System.out.println();
		}		
	}
}