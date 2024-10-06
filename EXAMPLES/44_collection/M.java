import java.util.*;

class M{
	public static void main(String[] args){
		TreeSet s = new TreeSet();

		s.add(78);	
		s.add(23);	
		s.add(49);	
		s.add(12);	
		s.add(52);
		s.add(36);
		
		//System.out.println(s);
		//System.out.println(s.first());
		//System.out.println(s.last());

		//SortedSet e = s.headSet(49);
		//SortedSet e = s.headSet(42);
		//System.out.println(e);

		//SortedSet e = s.tailSet(33);
		SortedSet e = s.tailSet(49);
		System.out.println(e);
	}
}