import java.util.*;

class J{
	public static void main(String[] args){
		//List x = new ArrayList();
		//Set x = new HashSet();
		//Queue x = new PriorityQueue();

		x.add(12);
		x.add(13);
		x.add(14);

		Object[] y = x.toArray();

		for(Object o : y){
			System.out.println(o);
		}
	}
}

