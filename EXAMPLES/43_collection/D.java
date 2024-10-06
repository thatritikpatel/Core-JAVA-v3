import java.util.PriorityQueue;

class D{
	public static void main(String[] args){
		PriorityQueue<Employee> pq = new PriorityQueue<Employee>();

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

class Employee implements Comparable<Employee>{
	String name;
	Integer age;

	Employee(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"#"+age;
	}

	public int compareTo(Employee o){
		return this.name.compareTo(o.name);
	}
}