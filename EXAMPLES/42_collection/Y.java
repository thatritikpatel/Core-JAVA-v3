import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;

class Y{
	public static void main(String[] args){
		System.out.println("Press:\n1 for NS\n2 for NRS\n3 for AS\n4 for ARS - ");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		Comparator<Student> z = null;
		if(x==1){
			z = new NameSort();
		}else if(x==2){
			z = new NameRevSort();
		}else if(x==3){
			z = new AgeSort();
		}else if(x==4){
			z = new AgeRevSort();
		}

		TreeSet<Student> set = new TreeSet<Student>(z);

		set.add(new Student("mohan",12));
		set.add(new Student("rohan",17));
		set.add(new Student("gohan",13));
		set.add(new Student("iohan",18));

		System.out.println(set);
	}
}

class Student{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}
}

class AgeSort implements Comparator<Student>{
	public int compare(Student o1,Student o2){
		return o1.age.compareTo(o2.age);
	}
}

class AgeRevSort implements Comparator<Student>{
	public int compare(Student o1,Student o2){
		return o2.age.compareTo(o1.age);
	}
}

class NameSort implements Comparator<Student>{
	public int compare(Student o1,Student o2){
		return o1.name.compareTo(o2.name);
	}
}

class NameRevSort implements Comparator<Student>{
	public int compare(Student o1,Student o2){
		return o2.name.compareTo(o1.name);
	}
}
