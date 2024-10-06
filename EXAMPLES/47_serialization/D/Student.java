class Student extends Person{
	String degree;
	float marks;

	Student(String name,int age,String degree,float marks){
		super(name,age);
		this.degree = degree;
		this.marks = marks;
	}
}