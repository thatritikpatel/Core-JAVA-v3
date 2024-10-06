import java.util.ArrayList;

class E{
	public static void main(String[] args){		
		ArrayList<Integer> x = new ArrayList<Integer>();		

		x.add(12);
		x.add(23);
		x.add(45);
		x.add(3);

		Integer i = x.get(2);
		
		System.out.println(i);
	}
}