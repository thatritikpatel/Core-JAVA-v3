import java.io.*;

class B{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Person p = (Person)(new ObjectInputStream(new FileInputStream("a.txt")).readObject());

		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.email);
		System.out.println(p.rank);
	}
}