import java.util.ArrayList;

class M{
	public static void main(String[] args){
		ArrayList y = pro();

		System.out.println(y);

		y.add("om");
		y.add(2.34);

		System.out.println(y);
	}

	static ArrayList<Integer> pro(){
		ArrayList<Integer> x = new ArrayList<Integer>();

		x.add(23);
		x.add(12);
		x.add(9);

		return x;
	}
}