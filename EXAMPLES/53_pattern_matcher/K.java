import java.util.regex.Pattern;
import java.util.regex.Matcher;

class K{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\w");
		Matcher m = p.matcher("#&~2+$a%_@^E-=!");

		System.out.println(p);
		System.out.println("\n\n#&~2+$a%_@^E-=!");
		System.out.println("################################################");

		while(m.find()){
			System.out.println(m.group()+" ++++ "+m.start()+" ++++ "+m.end());
		}		
	}
}