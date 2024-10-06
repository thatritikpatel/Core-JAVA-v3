import java.util.ArrayList;

class D{
	public static void main(String[] args){
		ArrayList x = new ArrayList();
		
		x.add(9);
		x.add(7);
		x.add(2);
		x.add(5);

		System.out.println(x);
		
		//x.add(2,10);
		x.set(2,10);

		System.out.println(x);
	}
}