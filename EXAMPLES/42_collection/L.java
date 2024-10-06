import java.util.TreeSet;

class L{
	public static void main(String[] args){
		TreeSet<Integer> set = new TreeSet<Integer>();

		set.add(56);
		set.add(13);
		set.add(78);
		set.add(34);
		set.add(13);
		
		System.out.println(set);
		Integer x = new Integer(78);
		//Integer x = new Integer(77);
		//System.out.println(set.contains(x));
		System.out.println(set.remove(x));
		System.out.println(set);
	}
}