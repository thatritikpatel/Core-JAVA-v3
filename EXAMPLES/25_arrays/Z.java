class Z{
	public static void main(String[] args){
		String[][] x = new String[4][];
		
		/*
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}*/
	
		/*
		x[0] = "mohan";
		x[0] = new String("mohan");
		x[0] = new int[];
		x[0] = 0;
		x[0] = new [4];
		x[0] = new int x[4];
		x[0] = new String["mohan"];		
		x[0] = new x(0)(1);
		x[0] = new x[5];
		*/

		x[0] = new String[3];
		x[1] = new String[2];
		x[2] = new String[4];
		x[3] = new String[5];
 

		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+"   ");
			}
			System.out.println();
		}
		
		
		//System.out.println(x instanceof String[][]);
		
		//System.out.println("~~~~~~~~~~~~");
		//System.out.println(x[0] instanceof String[]);
	

		//x[1][0] = "mohan";
		//System.out.println(x[1][0] instanceof String);
	}
}