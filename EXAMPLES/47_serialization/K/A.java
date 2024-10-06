import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
		Student s = new Student();
		s.name = "mohan";
		s.age = 15;
		s.marks = 567;

		Employee e = new Employee();
		e.name = "rajveer";
		e.salary = 23000;
		e.experience = 34;

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));

		oos.writeObject(s);
		oos.writeObject(e);
	}
}