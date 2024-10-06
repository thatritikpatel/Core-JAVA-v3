import java.io.Serializable;

class Student implements Serializable{
	String name;
	int age;
	Address address;

 	Student(String name, int age, Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
}