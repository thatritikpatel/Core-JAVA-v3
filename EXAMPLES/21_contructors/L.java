class Student{
	String name;
	int age;
	
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}

class L{
	public static void main(String[] args){
		Student a = new Student("mohan kumar",21);
		
		System.out.println(a.name);
		System.out.println(a.age);

		//a.name = "mohan kumar";
		//a.age = 12;

		//System.out.println(a.name);
		//System.out.println(a.age);
	}
}