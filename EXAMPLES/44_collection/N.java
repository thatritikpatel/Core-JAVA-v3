import java.util.*;

class N{
	public static void main(String[] args){
		TreeSet s = new TreeSet();

		s.add(78);	
		s.add(23);	
		s.add(49);	
		s.add(12);	
		s.add(52);
		s.add(36);
		
		//System.out.println(s);
		//System.out.println(s.ceiling(42));
		//System.out.println(s.ceiling(80));

		//System.out.println(s.floor(32));
		//System.out.println(s.floor(49));
		//System.out.println(s.floor(9));

		System.out.println(s.higher(42));
	}
}