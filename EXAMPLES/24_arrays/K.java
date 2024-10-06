import java.util.Scanner;

class K{
	public static void main(String[] args){
		int[] x = new int[3];

		Scanner s = new Scanner(System.in);

		for(int i=0;i<x.length;i++){
			System.out.println("Enter a number: ");
			x[i] = s.nextInt();
		}
		
		/*
		x[0] = 12;
		x[1] = 56;
		x[2] = 89;
		x[3] = 45;
		x[4] = 22;
		*/
		System.out.println("++++++++++++++++++");

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);	
		}

		/*
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);*/
	}
}