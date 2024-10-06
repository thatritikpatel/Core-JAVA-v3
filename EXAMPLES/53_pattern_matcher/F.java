import java.util.regex.Pattern;
import java.util.regex.Matcher;

class F{
	public static void main(String[] args){
		Pattern p = Pattern.compile("sohan");
		Matcher m = p.matcher("mohan is in class 12th. mohan is a good student.");

		System.out.println("mohan is in class 12th. mohan is a good student.");
		
		
		//Case 1:
		//System.out.println(m.start()+" ----- "+m.end());
		
		//Case 2:
		System.out.println(m.find());
		System.out.println(m.start()+" ----- "+m.end());
	}
}