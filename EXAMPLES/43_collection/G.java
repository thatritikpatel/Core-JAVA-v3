import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;
import java.io.Console;

class G{
	public static void main(String[] args){
		System.out.println("Press:\n 1 for NS\n2 for NRS\n3 for AS\n4 for ARS: ");
		
		int ui = Integer.parseInt(System.console().readLine());
		//int ui = new Scanner(System.in).nextInt();

		Comparator<Employee> ns = null;

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

class NameSort implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2){
		return o1.name.compareTo(o2.name);
	}
}

class NameRevSort implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2){
		return o2.name.compareTo(o1.name);
	}
}

class AgeSort implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2){
		return o1.age.compareTo(o2.age);
	}
}

class AgeRevSort implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2){
		return o2.age.compareTo(o1.age);
	}
}