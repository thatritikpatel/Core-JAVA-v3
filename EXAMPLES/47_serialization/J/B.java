import java.io.*;

class B{
	public static void main(String[] args) throws IOException{
		Student s = new Student();
		s.name = "ram";
		s.age = 15;
		s.maxAge = 24;

		new ObjectOutputStream(new FileOutputStream("b.txt")).writeObject(s);
	}
}