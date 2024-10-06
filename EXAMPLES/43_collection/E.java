import java.util.PriorityQueue;
import java.util.Comparator;

class E{
	public static void main(String[] args){
		//NameSort ns = new NameSort();
		//AgeSort ns = new AgeSort();
		AgeRevSort ns = new AgeRevSort();
		//NameRevSort ns = new NameRevSort();

		PriorityQueue<Employee> pq = new PriorityQueue<Employee>(ns);

		pq.offer(new Employee("suresh",34));
		pq.offer(new Employee("ganesh",28));
		pq.offer(new Employee("dinesh",42));
		pq.offer(new Employee("mahesh",39));
		pq.offer(new Employee("abcesh",25));

		//System.out.println(pq);

		int size = pq.size();
		for(int i=0;i<size;i++)
			System.out.println(pq.poll());
	}
}

class Employee{
	String name;
	Integer age;

	Employee(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"#"+age;
	}
}

class NameSort implements Comparator{
	public int compare(Object o1, Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		String nm1 = e1.name;
		String nm2 = e2.name;

		return nm1.compareTo(nm2);
	}
}

class NameRevSort implements Comparator{
	public int compare(Object o1, Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		String nm1 = e1.name;
		String nm2 = e2.name;

		return nm2.compareTo(nm1);
	}
}

class AgeSort implements Comparator{
	public int compare(Object o1, Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		Integer ag1 = e1.age;
		Integer ag2 = e2.age;

		return ag1.compareTo(ag2);
	}
}

class AgeRevSort implements Comparator{
	public int compare(Object o1, Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		Integer ag1 = e1.age;
		Integer ag2 = e2.age;

		return ag2.compareTo(ag1);
	}
}