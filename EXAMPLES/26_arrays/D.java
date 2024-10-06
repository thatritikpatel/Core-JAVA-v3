class D{
	public static void main(String[] args){
		String[][] x = {
							{"a1","a2"},
							{"b1"},
							{"c1","c2","c3"}
						};
		
		String[][] y;
		
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}