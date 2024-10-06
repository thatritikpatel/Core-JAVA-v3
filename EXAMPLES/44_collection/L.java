import java.util.*;

class L{
	public static void main(String[] args){
		List x = new ArrayList();

		x.add("mohan");
		x.add("ram");
		x.add("dinkar");
		

		String[] y = x.toArray();

		for(String o : y){
			System.out.println(o.length());
		}
	}
}

