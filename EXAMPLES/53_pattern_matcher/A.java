import java.util.regex.Pattern;

class A{
	public static void main(String[] args){
		Pattern p = Pattern.compile("mohan");
		System.out.println(p);
		System.out.println(p.pattern());
	}
}