import java.util.ArrayList;

class H{
	public static void main(String[] args){
		//Case 1:
		//int[] x = {12,45,67,true,"om",3.45};
		
		//Case 2:
		//ArraList allows heterogeneous records 
		ArrayList x = new ArrayList();

		x.add("mohan");
		x.add(12);
		x.add(3.45);
		x.add(true);

		System.out.println(x);
	}
}