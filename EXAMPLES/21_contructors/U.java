class Student{
	String name;
	String email;
	String college;
	String degree;

	Student(String name,String email,String college,String degree){
		super();
		this.name = name;
		this.email = email;
		this.college = college;
		this.degree = degree;
	}
}

class Teacher{
	String name;
	String email;
	int experience; //in months
	String qualification;

	Teacher(String name,String email,int experience,String qualification){
		super();
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.qualification = qualification;
	}
}

class U{
	public static void main(String[] args){
		Student student = new Student("Golu","golu@gmail.com","Global","BTech");

		System.out.println(student.name);

		Teacher teacher = new Teacher("Om Trivedi","om@gmail.com",45,"PHd");

		System.out.println(teacher.qualification);
	}
}