import java.util.ArrayList;

class K{
	public static void main(String[] args){
		ArrayList x = new ArrayList(); 

		x.add(5);
		x.add("om");
		x.add(true);

		pro(x);
	}

	static void pro(ArrayList<Integer> y){
		System.out.println(y.get(0));
		System.out.println(y.get(1));
		System.out.println(y.get(2));
		//y.add("mohan");
	}
}