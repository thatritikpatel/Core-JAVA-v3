import java.io.*;

class C{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Student x = (Student)(new ObjectInputStream(new FileInputStream("a.txt")).readObject());
		Student y = (Student)(new ObjectInputStream(new FileInputStream("b.txt")).readObject());

		System.out.println(x.name);
		System.out.println(x.age);
		System.out.println(x.maxAge);

		System.out.println("++++++++++++++++");

		System.out.println(y.name);
		System.out.println(y.age);
		System.out.println(y.maxAge);
	}
}