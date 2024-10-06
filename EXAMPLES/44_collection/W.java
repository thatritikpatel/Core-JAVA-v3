import java.util.Arrays;

class W{
	public static void main(String[] args){
		int[] x = {56,23,8,12,34};
		
		for(int tmp : x)
			System.out.print(tmp+" ");

		Arrays.sort(x);

		System.out.println();

		for(int tmp : x)
			System.out.print(tmp+" ");
	}
}