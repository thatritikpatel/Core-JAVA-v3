import java.util.ArrayList;

class E{
	public static void main(String[] args){
		ArrayList x = new ArrayList();
		
		x.add(9);
		x.add(7);
		x.add(2);
		x.add(5);

		System.out.println(x);
		
		//x.add(4,10);
		x.set(4,10);

		System.out.println(x);
	}
}