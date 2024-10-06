import java.util.ArrayList;

class I{
	public static void main(String[] args){		
		ArrayList x = new ArrayList();

		x.add("mohan");
		x.add(12);
		x.add(3.45);
		x.add(true);

		//String a = x.get(0);
		//String a = (String)x.get(0);

		//Integer a = x.get(1);
		//Integer a = (Integer)x.get(1);

		//System.out.println(x.get(0).length());
		System.out.println(((String)x.get(0)).length());

		//System.out.println(a);
	}
}