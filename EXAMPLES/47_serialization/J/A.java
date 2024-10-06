import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
		Student s = new Student();
		s.name = "om";
		s.age = 10;
		s.maxAge = 21;

		new ObjectOutputStream(new FileOutputStream("a.txt")).writeObject(s);
	}
}