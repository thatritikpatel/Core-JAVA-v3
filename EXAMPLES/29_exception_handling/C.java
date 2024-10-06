import java.util.Scanner;

class C{
	public static void main(String[] args){
		System.out.println(process());
	}

	static int process(){
		try{
			System.out.print("Enter a number: ");
			int x = new Scanner(System.in).nextInt();
			//input: 3, 0

			int a = 12/x;

			return a;
		}catch(ArithmeticException e){
			System.out.println("problem solved...");	
		}finally{
			System.out.println("essential steps...");
		}

		return 100;
	}
}