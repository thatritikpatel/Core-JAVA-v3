import java.util.TreeSet;

class O{
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

	public boolean equals(Object o){
		boolean flag = false;

		if(o instanceof Student){
			Student s1 = this;
			Student s2 = (Student)o;

			String name1 = s1.name;
			String name2 = s2.name;

			flag = name1.equals(name2);
		}

		return flag;
	}
}