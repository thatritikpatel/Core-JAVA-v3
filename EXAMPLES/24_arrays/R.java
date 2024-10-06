class R{
	public static void main(String[] args){
		String[] x = {"om","ram","mohan"};

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}

		for(int i=0;i<x.length;i++){
			x[i] = x[i].toUpperCase();
		}

		System.out.println("#############################");

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
}