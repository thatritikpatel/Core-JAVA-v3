import java.util.ArrayList;
import java.util.Collections;

class R{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("rohit");
		list.add("manju");
		list.add("kunal");
		list.add("naman");
		list.add("gopal");

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);
	}
}