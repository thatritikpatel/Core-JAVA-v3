class Student{
	String name;
	int age;

	static int maxAge = 20;

	public static void main(String[] args){
		Student x = new Student(); 		
		x.name = "mohan";
		x.age = 12;

		Student y = new Student();
		y.name = "ram";
		y.age = 16;

		System.out.println(x.age);
		System.out.println(y.name);

		System.out.println(x.maxAge);
		System.out.println(y.maxAge);
	}
}