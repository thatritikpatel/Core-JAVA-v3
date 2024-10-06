import java.util.Arrays;

class W1{
	public static void main(String[] args){
		String[] x = {"vinay","ekta","manoj","chetan","jagdeep"};
		
		for(String tmp : x)
			System.out.print(tmp+" ");

		Arrays.sort(x);

		System.out.println();

		for(String tmp : x)
			System.out.print(tmp+" ");
	}
}