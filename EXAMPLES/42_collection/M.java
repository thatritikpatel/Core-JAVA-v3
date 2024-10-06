import java.util.TreeSet;

class M{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add("mohan");
		set.add("tohan");
		set.add("iohan");
		set.add("gohan");
		set.add("mohan");

		System.out.println(set);
		String s = new String("iohan");
		System.out.println(set.contains(s));
		System.out.println(set.remove(s));
		System.out.println(set);
	}
}