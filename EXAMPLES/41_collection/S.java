import java.util.ArrayList;

class S{
	public static void main(String[] args){
		ArrayList arr = new ArrayList();

		arr.add(80);
		arr.add(56);
		arr.add(7);
		arr.add(67);
		arr.add(32);

		System.out.println(arr);

		for(int i=0;i<arr.size();i++){
			System.out.print(arr.remove(i)+" ");
		}

		System.out.println();

		System.out.println(arr);
	}
}