import java.util.ArrayList;
import java.util.Collections;

class S2{
	public static void main(String[] args){
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student("rohit",23));
		list.add(new Student("manju",32));
		list.add(new Student("kunal",12));
		list.add(new Student("naman",19));
		list.add(new Student("gopal",9));

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);
	}
}

class Student implements Comparable<Student>{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}

	
	public int compareTo(Student o){
		return this.age.compareTo(o.age);
	}
	
	/*
	public int compareTo(Student o){
		return this.name.compareTo(o.name);
	}*/
}