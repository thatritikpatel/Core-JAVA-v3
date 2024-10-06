import java.util.ArrayList;

class L{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("gohan");
		list.add("tohan");

		for(String tmp : list){
			System.out.println(tmp);
		}
	}
}