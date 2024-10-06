class G{
	public static void main(String[] args){
		/*
		int[] x = {12,56,89,34,3};


		for(int tmp : x){
			System.out.println(tmp);
		}*/


		String[][] x = {
							{"a1","a2","a3","a4","a5"},
							{"b1","b2","b3","b4","b5","b6","b7"},
							{"c1","c2","c3"},							
							{"d1","d2","d3","d4"}
						};

		
		for(String[] y : x){
			for(String e : y){
				System.out.print(e+" ");
			}
			System.out.println();
		}

		/*
		for(String[] tmp : x){
			for(String a : tmp){
				System.out.print(a+"#  ");
			}	
			System.out.println();
		}*/
	}
}