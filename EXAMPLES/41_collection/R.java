import java.util.ArrayList;

class R{
	public static void main(String[] args){
		ArrayList x = new ArrayList();
		
		x.add(new Student("mohan",12));
		x.add(new Student("rohan",17));
		x.add(new Student("sohan",10));
		x.add(new Student("gohan",9));
		x.add(new Student("tohan",15));

		System.out.println(x);

		Student z = new Student("sohan",10);

		//System.out.println(x.contains(z));
		System.out.println(x.remove(z));

		System.out.println(x);
	}
}

class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}
}