import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;

class W{
	public static void main(String[] args){
		System.out.println("Press:\n1 for NS\n2 for NRS\n3 for AS\n4 for ARS - ");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		Comparator z = null;
		if(x==1){
			z = new NameSort();
		}else if(x==2){
			z = new NameRevSort();
		}else if(x==3){
			z = new AgeSort();
		}else if(x==4){
			z = new AgeRevSort();
		}

		TreeSet set = new TreeSet(z);

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

class AgeSort implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		Integer age1 = s1.age;
		Integer age2 = s2.age;

		return age1.compareTo(age2);
	}
}

class AgeRevSort implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		Integer age1 = s1.age;
		Integer age2 = s2.age;

		return age2.compareTo(age1);
	}
}


class NameSort implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		String name1 = s1.name;
		String name2 = s2.name;

		return name1.compareTo(name2);
	}
}

class NameRevSort implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm2.compareTo(nm1);
	}
}