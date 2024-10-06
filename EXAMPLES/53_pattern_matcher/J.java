import java.util.regex.Pattern;
import java.util.regex.Matcher;

class J{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\d\\d");
		Matcher m = p.matcher("mohan is in class 11th and he is 7 years old");

		System.out.println(p);
		System.out.println("\n\nmohan is in class 11th and he is 7 years old");
		System.out.println("################################################");

		while(m.find()){
			System.out.println(m.group()+" ++++ "+m.start()+" ++++ "+m.end());
		}		
	}
}