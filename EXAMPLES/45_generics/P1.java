import java.util.ArrayList;

class P1{
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(34);
		a.add(78);
		
		ArrayList<Long> b = new ArrayList<Long>();
		b.add(56L);
		b.add(23L);		

		pro(a);
		pro(b);
	}

	/*static void pro(ArrayList<Number> x){
		
	}*/

	static void pro(ArrayList<Integer> x){
		System.out.println(x);
	}

	static void pro(ArrayList<Long> x){
		System.out.println(x);
	}
}