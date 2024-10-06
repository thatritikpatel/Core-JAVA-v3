import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
		Student s = new Student();
		s.name = "ganesh";
		s.age = 12;
		s.degree = "BTech";
		s.marks = 23.45f;

		new ObjectOutputStream(
			new FileOutputStream("a.txt")
		).writeObject(s);
	}
}