import java.util.ArrayList;
import java.util.Collections;

class U1{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(34);
		list.add(19);
		list.add(23);
		list.add(3);
		list.add(12);		

		System.out.println(list);		
		Collections.sort(list);
		System.out.println(list);
		//Integer s = new Integer(23);	
		//Integer s = new Integer(3);	
		//Integer s = new Integer(19);	
		//Integer s = new Integer(34);
		//Integer s = new Integer(24);
		//Integer s = new Integer(1);
		//Integer s = new Integer(78);
		Integer s = new Integer(15);
		int index = Collections.binarySearch(list,s);

		System.out.println(index);
	}
}








