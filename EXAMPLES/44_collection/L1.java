import java.util.*;

class L1{
	public static void main(String[] args){
		List x = new ArrayList();

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

