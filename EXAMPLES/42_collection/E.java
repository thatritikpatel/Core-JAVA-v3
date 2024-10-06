class E{
	public static void main(String[] args){
		Student s = new Student("mohan",23);
		Employee e = new Employee("mohan",23);

		s.equals(e);		
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
		Student s1 = this;
		Student s2 = (Student)o;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.equals(nm2);
	}
}

class Employee{
	String name;
	int age;

	Employee(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}

	public boolean equals(Object o){
		Employee s1 = this;
		Employee s2 = (Employee)o;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.equals(nm2);
	}
}