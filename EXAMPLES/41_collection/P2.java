import java.util.ArrayList;
import java.util.Iterator;

class P2{
	public static void main(String[] args){
		ArrayList<String> x = new ArrayList<String>();

		x.add("om");
		x.add("ganesh");
		x.add("vishwambhar");
		x.add("prateek");
		x.add("suman");

		Iterator<String> i = x.iterator();
		while(i.hasNext()){
			String tmp = i.next();
			System.out.println(tmp+" ~ "+tmp.length());
		}
	}
}