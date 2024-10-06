import java.util.regex.Pattern;
import java.util.regex.Matcher;

class L{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("as2er M_%as\t45tyu)\nas12$\fqwzskniuw39\rus7a62");

		System.out.println(p);
		System.out.println("\n\nas2er M_%as\t45tyu)\nas12$\fqwzskniuw39\rus7a62");
		System.out.println("###################################################");

		while(m.find()){
			System.out.println(m.group()+" ++++ "+m.start()+" ++++ "+m.end());
		}		
	}
}