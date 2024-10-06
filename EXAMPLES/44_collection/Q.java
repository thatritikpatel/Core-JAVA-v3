import java.util.ArrayList;
import java.util.Collections;

class Q{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(56);
		list.add(23);
		list.add(62);
		list.add(39);
		list.add(8);

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);
	}
}