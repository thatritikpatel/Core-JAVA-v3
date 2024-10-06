import java.util.*;

class L2{
	public static void main(String[] args){
		List<String> x = new ArrayList<String>();

		x.add("mohan");
		x.add("ram");
		x.add("dinkar");
		
		String[] a = new String[0];
		String[] y = x.toArray(a);

		for(String o : y){
			System.out.println(o.length());
		}
	}
}

