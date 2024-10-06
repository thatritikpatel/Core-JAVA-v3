import java.util.regex.Pattern;
import java.util.regex.Matcher;

class N{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[^nst]");
		Matcher m = p.matcher("mohan is a good student.");

		System.out.println(p);
		System.out.println("\n\nmohan is a good student.");
		System.out.println("############################");

		while(m.find()){
			System.out.println(m.group()+" ++++ "+m.start()+" ++++ "+m.end());
		}		
	}
}