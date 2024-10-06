import java.util.ArrayList;

class L{
	public static void main(String[] args){
		ArrayList<Integer> x = new ArrayList<Integer>();

		x.add(23);
		x.add(78);
		x.add(11);

		pro(x);
	}

	static void pro(ArrayList y){
		System.out.println(y);
		y.add("om");
		y.add(true);
		y.add(2.34);
		System.out.println(y);
	}
}