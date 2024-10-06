import java.util.ArrayList;

class D{
	public static void main(String[] args){		
		
		ArrayList x = new ArrayList();

		x.add(12);
		x.add(23);
		x.add(45);
		x.add(3);

		
		Integer i = (Integer)x.get(2);

		System.out.println(i);
	}
}