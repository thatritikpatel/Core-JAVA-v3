import java.util.ArrayList;

class F{
	public static void main(String[] args){
		ArrayList x = new ArrayList();
		
		x.add(9);
		x.add(7);
		x.add(1);
		x.add(5);

		System.out.println(x);
		
		//System.out.println(x.get(2));
		System.out.println(x.remove(2));

		System.out.println(x);
	}
}