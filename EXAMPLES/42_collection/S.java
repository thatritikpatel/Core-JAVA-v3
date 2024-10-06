import java.util.TreeSet;

class S{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add(new Student("mohan",12));
		set.add(new Student("rohan",17));
		set.add(new Student("gohan",13));
		set.add(new Student("iohan",18));

		System.out.println(set);
	}
}

class Student implements Comparable{
	String name;
	Integer age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}

	public int compareTo(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		Integer ag1 = s1.age;
		Integer ag2 = s2.age;

		return ag1.compareTo(ag2);
	}

	/*
	public int compareTo(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.compareTo(nm2);
	}*/
}