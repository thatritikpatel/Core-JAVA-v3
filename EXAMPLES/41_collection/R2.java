class R2{
	public static void main(String[] args){
		Student s1 = new Student("om",10);
		Student s2 = new Student("om",10);

		System.out.println(s1==s2);

		System.out.println(s1.equals(s2));
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
		
		String name1 = s1.name;
		String name2 = s2.name;

		return name1.equals(name2);
	}
}