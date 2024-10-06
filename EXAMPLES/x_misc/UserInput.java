import java.io.Console;

class UserInput{
	public static void main(String[] args){
		Console c = System.console();

		String input = c.readLine();

		System.out.println("#######################################");
		System.out.println(input+3);
		int tmp = Integer.parseInt(input);
		System.out.println(tmp+3);
		System.out.println("#######################################");
	}
}