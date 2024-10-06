import java.util.ArrayList;

class X{
	public static void main(String[] args){
		ArrayList<Integer> x = new ArrayList<Integer>();

		x.add(78);
		x.add(12);
		x.add(90);

		pro(x);
	}

	static void pro(ArrayList<? extends Number> y){
		System.out.println(y);
		
		//y.add(45); //NOTOK
		//System.out.println(y.get(0));
		//System.out.println(y.remove(0));
		//y.set(0,56); //NOTOK
	}
}