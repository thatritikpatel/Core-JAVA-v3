import java.util.ArrayList;
import java.util.Collections;

class V1{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(new Student("rohit",23));
		list.add(new Student("manju",32));
		list.add(new Student("kunal",12));
		list.add(new Student("naman",19));
		list.add(new Student("gopal",9));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		//Student s = new Student("naman",19);
		//Student s = new Student("lav",3);
		Student s = new Student("om",23);
		int val = Collections.binarySearch(list,s);
		System.out.println(val);
	}
}

class Student implements Comparable{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}

	public int compareTo(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.compareTo(nm2);
	}
}