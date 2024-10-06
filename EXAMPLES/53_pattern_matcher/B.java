import java.util.regex.Pattern;
import java.util.regex.Matcher;

class B{
	public static void main(String[] args){
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is in class 12th. Mohan likes to play cricket");

		System.out.println(m);
		System.out.println(m.pattern());
		System.out.println(p);
		System.out.println(p.pattern());
	}
}