import java.util.TreeMap;

class P{
	public static void main(String[] args){
		TreeMap tm = new TreeMap();

		tm.put("mohan",12);
		tm.put("dinesh",23);
		tm.put("rohit",9);
		tm.put("vijay",32);
		tm.put("manan",19);
		tm.put("gopal",7);

		//System.out.println(tm.ceilingKey("hitesh"));
		System.out.println(tm.floorKey("sanjay"));
		
	}
}