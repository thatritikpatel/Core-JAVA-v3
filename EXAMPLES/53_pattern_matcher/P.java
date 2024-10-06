import java.util.regex.Pattern;
import java.util.regex.Matcher;

class P{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[d-m&&[j-s]]");
		Matcher m = p.matcher("mohan is in jammu and kashmir.");

		System.out.println(p);
		System.out.println("\n\nmohan is in jammu and kashmir.");
		System.out.println("############################");

		while(m.find()){
			System.out.println(m.group()+" ++++ "+m.start()+" ++++ "+m.end());
		}		
	}
}