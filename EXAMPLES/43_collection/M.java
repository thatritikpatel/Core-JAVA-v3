import java.util.HashMap;
import java.util.Scanner;
import java.io.Console;

class M{
	public static void main(String[] args){
		HashMap<String,Integer> map = new HashMap<String,Integer>();

		Scanner sc = new Scanner(System.in);
		Console cn = System.console();

		System.out.println("Enter your name: ");
		String name = cn.readLine();

		System.out.println("Enter your age: ");
		int age = sc.nextInt();


		map.put(age,name);

		System.out.println(map);
	} 
}