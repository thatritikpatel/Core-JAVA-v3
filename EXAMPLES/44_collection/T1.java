import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class T1{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(new Student("rohit",23));
		list.add(new Student("manju",32));
		list.add(new Student("kunal",12));
		list.add(new Student("naman",19));
		list.add(new Student("gopal",9));

		System.out.println(list);
		
		System.out.println("Enter:\n1 for NS\n2 for NRS\n3 for AS\n4 for ARS\nChoose one of the above option: ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		Comparator comp = null;
		boolean flag = true;

		if(val==1){
			comp = new NameSort();
		}else if(val==2){
			comp = new NameRevSort();
		}else if(val==3){
			comp = new AgeSort();
		}else if(val==4){
			comp = new AgeRevSort();
		}else{
			flag = false;
			System.out.println("Invalid Input!!!");
		}
		
		if(flag){
			Collections.sort(list,comp);

			System.out.println(list);
		}
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

		String name1 = s1.name;
		String name2 = s2.name;

		return name2.compareTo(name1);
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