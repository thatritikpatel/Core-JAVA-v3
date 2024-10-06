import java.util.ArrayList;

class Q{
	public static void main(String[] args){
		ArrayList x = new ArrayList();

		x.add("Dholu");
		x.add("Bholu");
		x.add("Chhota Bheem");
		x.add("Chhutki");
		x.add("Jaggu");
		x.add("Raju");
		x.add("Kaliya");

		System.out.println(x);

		//String tmp = "Jaggu";
		String tmp = "Avi Chacha";
		System.out.println(x.contains(tmp));
	}
}