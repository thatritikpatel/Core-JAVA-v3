import java.util.*;

class K{
	public static void main(String[] args){
		List x = new ArrayList();

		x.add("mohan");
		x.add("ram");
		x.add("dinkar");

		Object[] y = x.toArray();

		for(Object o : y){
			System.out.println(o.length());
		}
	}
}

