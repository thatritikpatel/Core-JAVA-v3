import java.util.Arrays;

import java.util.Scanner;

import java.util.Comparator;


class X{
	public static void main(String[] args){
		Student[] x = {
						new Student("hareesh",34),
						new Student("om",23),
						new Student("chetan",29),
						new Student("ganesh",25),
						new Student("abhay",31)
					  };
		
		

		System.out.println();

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

		Arrays.sort(x,comp);

		for(Student tmp : x)
			System.out.print(tmp+" ");

		System.out.println();
		
		Student t = new Student("isha",26);
		System.out.print(Arrays.binarySearch(x,t,comp));
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
		return name+"^"+age;
	}
}