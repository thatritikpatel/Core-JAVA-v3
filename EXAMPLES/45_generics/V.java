import java.util.ArrayList;

class V{
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(34);
		a.add(78);				

		pro(a);
	}

	static void pro(ArrayList<? extends Number> x){
		x.add(23);  //NOT OK
	}
}