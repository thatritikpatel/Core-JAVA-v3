import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

class T{
	public static void main(String[] args){
		HashMap h = new HashMap();
		
		h.put("mohan",23);
		h.put("sohan",12);
		h.put("rohan",9);
		h.put("gohan",15);
		
		Set set = h.keySet();

		Iterator itr = set.iterator();
		while(itr.hasNext()){
			String key = (String)itr.next();
			System.out.println(key+" ~ "+h.get(key));
		}
	}
}
