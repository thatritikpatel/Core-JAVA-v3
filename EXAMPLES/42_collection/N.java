import java.util.TreeSet;

class N{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add(new Student("mohan",12));
		set.add(new Student("rohan",17));
		set.add(new Student("gohan",13));
		set.add(new Student("iohan",18));

		System.out.println(set);
	}
}

class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}
}