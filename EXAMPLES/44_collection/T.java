import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class T{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(new Student("rohit",23));
		list.add(new Student("manju",32));
		list.add(new Student("kunal",12));
		list.add(new Student("naman",19));
		list.add(new Student("gopal",9));

		System.out.println(list);
		
		NameSort ns = new NameSort();
		Collections.sort(list,ns);

		System.out.println(list);
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