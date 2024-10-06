import java.util.HashSet;

class A{
	public static void main(String[] args){
		HashSet set = new HashSet();
		
		set.add(new Student("mohan",12));
		set.add(new Student("rohan",12));
		set.add(new Student("mohan",12));
		set.add(new Student("sohan",12));
		set.add(new Student("tohan",12));

		//System.out.println(set);
		//System.out.println(set.size());

		Student t = new Student("sohan",12);
		//System.out.println(set.contains(t));
		System.out.println(set.remove(t));
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
		return name+" - "+age;	
	}

	public int hashCode(){
		return 20;
	}

	public boolean equals(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.equals(nm2);		
		
		//return this.name.equals(((Student)o).name);
	}
}