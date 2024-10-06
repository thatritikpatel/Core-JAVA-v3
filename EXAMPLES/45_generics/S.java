import java.util.ArrayList;

class S{
	public static void main(String[] args){
		ArrayList<? extends Number> x = new ArrayList<Integer>();
		
		//x.add(23.45);
		//x.add(11L);
		//x.add(34);
		

		System.out.println(x);
	} 
}