import java.io.Serializable;

class Employee implements Serializable{
	String name;
	int age;
	transient Address address;

	Employee(String name,int age,Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
}