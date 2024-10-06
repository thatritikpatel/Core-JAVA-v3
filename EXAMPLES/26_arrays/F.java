class F{
	public static void main(String[] args){
		String[][] x = {
							{"a1","a2","a3","a4","a5"},
							{"b1","b2","b3","b4","b5","b6","b7"},
							{"c1","c2","c3"},							
							{"d1","d2","d3","d4"}
						};
		
		String[][] y = new String[x.length][];

		for(int i=0;i<x.length;i++){
			System.out.println(y[i]);
		}
		
		for(int i=0;i<x.length;i++){
			y[i] = new String[x[i].length];
			for(int j=0;j<x[i].length;j++){
				y[i][j] = x[i][x[i].length-j-1];
			}
		}
		
		System.out.println("-------------");

		for(int i=0;i<y.length;i++){
			for(int j=0;j<y[i].length;j++){
				System.out.print(y[i][j]+"-  ");
			}
			System.out.println();
		}
		
		
		
		//after code

		
		/*

		String[][] y = {
							{"c1","c2","c3"},
							{"b1"},
							{"a1","a2"}							
						};
		
		String[][] y = {
							{"c3","c2","c1"},
							{"b1"},
							{"a2","a1"}							
						};

		*/
	}
}