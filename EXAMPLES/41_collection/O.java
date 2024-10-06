import java.util.ArrayList;
import java.util.Iterator;

class O{
	public static void main(String[] args){
		ArrayList x = new ArrayList();

		x.add(12);
		x.add(67);
		x.add(45);
		x.add(78);
		x.add(23);

		Iterator i = x.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}