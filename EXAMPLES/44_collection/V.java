import java.util.ArrayList;
import java.util.Collections;

class V{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(new Student("rohit",23));
		list.add(new Student("manju",32));
		list.add(new Student("kunal",12));
		list.add(new Student("naman",19));
		list.add(new Student("gopal",9));

		System.out.println(list);
		
		Student s = new Student("naman",19);
		Collections.binarySearch(list,s);
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