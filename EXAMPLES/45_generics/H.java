import java.util.ArrayList;

class H{
	public static void main(String[] args){
		ArrayList x1 = new ArrayList<Long>();
		ArrayList<Long> x2 = new ArrayList();
		
		x1.add(12);
		x1.add("om");
		x1.add(true);

		x2.add(12L);
		x2.add("om");
		x2.add(true);
	}
}