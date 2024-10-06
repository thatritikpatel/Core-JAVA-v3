import java.util.ArrayList;

class S2{
	public static void main(String[] args){
		ArrayList arr = new ArrayList();

		arr.add(80);
		arr.add(56);
		arr.add(7);
		arr.add(67);
		arr.add(32);

		//System.out.println(arr);

		int size = arr.size();
		for(int i=0;i<size;i++){
			System.out.println(arr.remove(i)+" ");			
		}	
		
		//System.out.println(arr);
	}
}