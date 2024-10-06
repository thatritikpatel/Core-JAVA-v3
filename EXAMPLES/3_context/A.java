class Student{
	String name;
	int age;
	static int maxAge = 20;

	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "mohan";
		s1.age = 12;
		s1.showInfo();
	} 

	void showInfo(){
		System.out.println(name);
	}
}