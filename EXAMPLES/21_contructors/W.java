class Person{
	String name;
	String email;

	Person(String name,String email){
		this.name = name;
		this.email = email;
	}
}


class Student extends Person{	
	String college;
	String degree;

	Student(String name,String email,String college,String degree){
		super(name,email);
		
		this.college = college;
		this.degree = degree;
	}
}

class Teacher extends Person{	
	int experience; //in months
	String qualification;

	Teacher(String name,String email,int experience,String qualification){
		super(name,email);
		
		this.experience = experience;
		this.qualification = qualification;
	}
}

class W{
	public static void main(String[] args){
		Student student = new Student("Bholu","golu@gmail.com","Global","BTech");

		System.out.println(student.name);

		Teacher teacher = new Teacher("Om Trivedi","om@gmail.com",45,"MTech");

		System.out.println(teacher.qualification);
	}
}