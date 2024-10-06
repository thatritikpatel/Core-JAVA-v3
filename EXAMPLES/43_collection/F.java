import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;
import java.io.Console;

class F{
	public static void main(String[] args){
		System.out.println("Press:\n 1 for NS\n2 for NRS\n3 for AS\n4 for ARS: ");
		
		//Console c = System.console();
		//String inp = c.readLine();
		//int ui = Integer.parseInt(inp);

		int ui = Integer.parseInt(System.console().readLine());
		//int ui = new Scanner(System.in).nextInt();

		Comparator ns = null;

		if(ui==1)
			ns = new NameSort();
		else if(ui==2)
			ns = new NameRevSort();
		else if(ui==3)
			ns = new AgeSort();
		else if(ui==4)
			ns = new AgeRevSort();

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