import java.util.HashMap;

class P{
	public static void main(String[] args){
		HashMap h = new HashMap();
		
		h.put("mohan",23);
		h.put("sohan",12);
		h.put("rohan",9);
		h.put("gohan",15);

		System.out.println(h);
		
		//System.out.println(h.put("dinesh",22));
		System.out.println(h.put("sohan",100));

		System.out.println(h);
	}
}
