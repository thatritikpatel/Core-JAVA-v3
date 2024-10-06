import java.util.regex.Pattern;
import java.util.regex.Matcher;

class G{
	public static void main(String[] args){
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is in class 12th. mohan is a good student.");

		System.out.println("mohan is in class 12th. mohan is a good student.");
				
		
		System.out.println(m.find());
		System.out.println(m.start()+" ----- "+m.end()+" ---- "+m.group());

		System.out.println(m.find());
		System.out.println(m.start()+" ----- "+m.end()+" ---- "+m.group());
	}
}