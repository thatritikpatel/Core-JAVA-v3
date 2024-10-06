import java.io.*;

class B{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Student s = (Student)(new ObjectInputStream(
									new FileInputStream("a.txt")
								).readObject());

		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.degree);
		System.out.println(s.marks);
	}
}