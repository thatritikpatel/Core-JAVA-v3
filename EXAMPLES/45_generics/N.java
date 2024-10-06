import java.util.ArrayList;

class N{
	public static void main(String[] args){
		ArrayList<Integer> x = pro();

		System.out.println(x);

		x.add(45);
		x.add(13);
		x.add('A');

		System.out.println(x);
	}

	static ArrayList pro(){
		ArrayList a = new ArrayList();

		a.add("om");
		a.add(true);
		a.add(3.45);

		return a;
	}
}