import java.util.regex.Pattern;
import java.util.regex.Matcher;

class D{
	public static void main(String[] args){
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is in class 12th. mohan is a good student. mohan likes to play cricket");

		System.out.println("mohan is in class 12th. mohan is a good student. mohan likes to play cricket");
		
		System.out.println(m);
		System.out.println(m.find());
		System.out.println(m);
		System.out.println(m.find());
		System.out.println(m);
		System.out.println(m.find());
		System.out.println(m);
		System.out.println(m.find());
		System.out.println(m);
	}
}