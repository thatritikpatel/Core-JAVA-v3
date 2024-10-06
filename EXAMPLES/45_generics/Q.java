import java.util.ArrayList;

class Q{
	public static void main(String[] args){
		//ArrayList<Number> x = new ArrayList<Integer>();

		ArrayList<Number> x = new ArrayList<Number>();
		x.add(12);
		x.add(12L);
		x.add(12.45);
		byte t = 23; 
		x.add(t);

		System.out.println(x);
	} 
}