import java.util.ArrayList;

class N{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();

		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("gohan");
		list.add("tohan");

		for(String tmp : list){
			System.out.println(tmp+" ^");
		}
	}
}