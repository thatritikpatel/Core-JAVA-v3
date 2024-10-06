class F{
	public static void main(String[] args){
		Student s = new Student("mohan",23);
		Employee e = new Employee("mohan",23);

		System.out.println(s.equals(e));		
		System.out.println(e.equals(s));		
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

			String nm1 = s1.name;
			String nm2 = s2.name;

			flag = nm1.equals(nm2);
		}

		return flag;
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
		boolean flag = false;
		
		if(o instanceof Employee){
			Employee e1 = this;
			Employee e2 = (Employee)o;

			String nm1 = e1.name;
			String nm2 = e2.name;

			if(nm1.equals(nm2)){
				flag = true;
			}
		}

		return flag;
	}
}