class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}

class I{
	public static void main(String[] args){
		Student[] x = new Student[2];

		System.out.println(x[0]);
		System.out.println(x[1]);

		x[0] = new Student("om",12);
		x[1] = new Student("ram",15);

		System.out.println(x[0]);
		System.out.println(x[1]);

		System.out.println(x[0].name);
		System.out.println(x[0].age);

		System.out.println(x[1].name);
		System.out.println(x[1].age);
	}
}