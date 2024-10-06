import java.util.Scanner;

class Y{
	public static void main(String[] args){
		int[][] x = new int[3][];

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		
		x[0] = new int[2];
		x[1] = new int[5];
		x[2] = new int[3];

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				x[i][j] = sc.nextInt();
			}			
		}

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]+"~"+x[i].length);
		}

		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	}
}