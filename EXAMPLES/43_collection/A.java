import java.util.PriorityQueue;
import java.util.TreeSet;

class A{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue();		

		pq.offer("mohan");
		pq.offer("mohan");

		System.out.println(pq);


		TreeSet ts = new TreeSet();

		ts.add("mohan");	
		ts.add("mohan");
		
		System.out.println(ts);
	}
}