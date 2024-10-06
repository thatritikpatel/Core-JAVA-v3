class Student{
	String name;
	int age;
	static int maxAge = 20;
	
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "ganesh";
		s1.age = 12;

		Student s2 = new Student();
		s2.name = "vidya";
		s2.age = 7;

		System.out.println(s2.maxAge);
		System.out.println(s1.maxAge);

		System.out.println(s2.age);
		System.out.println(s1.name);
	}
}