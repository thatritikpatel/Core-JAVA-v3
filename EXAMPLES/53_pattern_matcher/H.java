import java.util.regex.Pattern;
import java.util.regex.Matcher;

class H{
	public static void main(String[] args){
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is in class 12th. mohan is a good student. mohan is a good player.");

		System.out.println("\n\nmohan is in class 12th. mohan is a good student. mohan is a good player.");
		System.out.println("############################################################################");

		while(m.find()){
			System.out.println(m.group()+" ++++ "+m.start()+" ++++ "+m.end());
		}		
	}
}