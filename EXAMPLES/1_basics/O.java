class Student{
	String name;
	int age;

	static int maxAge = 20;

	public static void main(String[] args){
		Student x = new Student(); 		
		System.out.println(x.name);
		System.out.println(x.age);
		x.name = "mohan";
		x.age = 17;
		System.out.println(x.name);
		System.out.println(x.age);
	}
}