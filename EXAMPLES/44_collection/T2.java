import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class T2{
	public static void main(String[] args){
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student("rohit",23));
		list.add(new Student("manju",32));
		list.add(new Student("kunal",12));
		list.add(new Student("naman",19));
		list.add(new Student("gopal",9));

		System.out.println(list);
		
		System.out.println("Enter:\n1 for NS\n2 for NRS\n3 for AS\n4 for ARS\nChoose one of the above option: ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		Comparator<Student> comp = null;
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