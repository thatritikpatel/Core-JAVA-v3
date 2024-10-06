import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class V2{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(new Student("rohit",23));
		list.add(new Student("manju",32));
		list.add(new Student("kunal",12));
		list.add(new Student("naman",19));
		list.add(new Student("gopal",9));

		System.out.println(list);

		System.out.println("Enter 1 for NS, 2 for NRS, 3 for AS, 4 for ARS: ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		Comparator comp = null;

		if(val==1){
			comp = new NameSort();
		}else if(val==2){
			comp = new NameRevSort();
		}else if(val==3){
			comp = new AgeSort();
		}else if(val==4){
			comp = new AgeRevSort();
		}

		Collections.sort(list,comp);
		System.out.println(list);

		Student s = new Student("naman",19);
		//Student s = new Student("lav",3);
		//Student s = new Student("om",23);
		int res = Collections.binarySearch(list,s,comp);
		System.out.println(res);
	}
}

class NameSort implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		return s1.name.compareTo(s2.name);
	}
}

class NameRevSort implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		return s2.name.compareTo(s1.name);
	}
}

class AgeSort implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		return s1.age.compareTo(s2.age);
	}
}

class AgeRevSort implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		return s2.age.compareTo(s1.age);
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