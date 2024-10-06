import java.util.ArrayList;
import java.util.Iterator;

class P{
	public static void main(String[] args){
		ArrayList x = new ArrayList();

		x.add("om");
		x.add("ganesh");
		x.add("vishwambhar");
		x.add("prateek");
		x.add("suman");

		Iterator i = x.iterator();
		while(i.hasNext()){
			String tmp = i.next();
			System.out.println(tmp+" - "+tmp.length());
		}
	}
}