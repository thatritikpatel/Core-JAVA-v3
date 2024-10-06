import java.util.TreeSet;

class X{
	public static void main(String[] args){
		TreeSet<Student> ts = new TreeSet<Student>();

		ts.add(new Student("mohan",12));
		ts.add(new Student("sohan",16));
		ts.add(new Student("tohan",9));
		ts.add(new Student("gohan",13));

		System.out.println(ts);
	}
}

class Student implements Comparable<Student>{
	String name;
	Integer age;

	Student(String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"~"+age;
	}

	public int compareTo(Student o){
		return o.name.compareTo(this.name);
	}
}