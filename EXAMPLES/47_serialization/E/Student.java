import java.io.Serializable;

class Student extends Person implements Serializable{
	String degree;
	float marks;

	Student(String name,int age,String degree,float marks){
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.marks = marks;
	}
}