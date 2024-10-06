import java.util.HashMap;

class O{
	public static void main(String[] args){
		HashMap h = new HashMap();
		
		h.put("mohan",23);
		h.put("sohan",12);
		h.put("rohan",9);
		h.put("gohan",15);

		System.out.println(h);
		
		//System.out.println(h.remove("rohan"));
		System.out.println(h.get("iohan"));

		System.out.println(h);
	}
}
