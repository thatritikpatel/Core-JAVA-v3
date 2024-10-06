import java.util.ArrayList;

class T{
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

	static void pro(ArrayList<? extends Number> x){
		for(Number  tmp : x){
			System.out.println(tmp);
		}
	}
}