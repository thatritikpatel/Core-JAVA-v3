import java.util.ArrayList;

class C{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(9);
		list.add(4);
		list.add(7);
		list.add(2);
		list.add(5);

		System.out.println(list);

		//list.remove(2);
		Integer i = new Integer(2);
		list.remove(i);

		System.out.println(list);
	}
}