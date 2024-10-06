class Student{
	String name;
	int age;
}

class K{
	public static void main(String[] args){
		Student a = new Student();
		
		System.out.println(a.name);
		System.out.println(a.age);

		a.name = "mohan kumar";
		a.age = 12;

		System.out.println(a.name);
		System.out.println(a.age);
	}
}