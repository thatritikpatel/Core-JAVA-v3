import java.util.LinkedHashMap;

class C{
	public static void main(String[] args){
		LinkedHashMap x = new LinkedHashMap();
		
		/*
		x.put("mohan",63);
		x.put("tohan",45);
		x.put("gohan",21);
		x.put("eohan",32);*/

		x.put(63,"mohan");
		x.put(45,"tohan");
		x.put(21,"gohan");
		x.put(32,"eohan");

		System.out.println(x);
	}
}