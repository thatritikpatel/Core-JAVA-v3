import java.io.Serializable;

class Person implements Serializable{
	//Case 1:
	//transient String name;
	//transient int age;
	
	//Case 2:
	transient String name = "rajesh";
	transient int age = 56;
	
	String email;
	float rank;

	Person(String name,	int age,String email,float rank){
		this.name = name;
		this.age = age;
		this.email = email;
		this.rank = rank;
	}
}