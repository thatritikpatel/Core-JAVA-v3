import java.util.PriorityQueue;

class B{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue();

		pq.offer(new Employee("suresh",34));
		pq.offer(new Employee("ganesh",28));
		pq.offer(new Employee("dinesh",42));
		pq.offer(new Employee("mahesh",39));

		System.out.println(pq);
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