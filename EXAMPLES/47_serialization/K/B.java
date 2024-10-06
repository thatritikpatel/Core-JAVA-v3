import java.io.*;

class B{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));

		Student x = (Student)ois.readObject();
		Employee y = (Employee)ois.readObject();

		System.out.println(x.name);
		System.out.println(x.age);
		System.out.println(x.marks);

		System.out.println("++++++++++++");

		System.out.println(y.name);
		System.out.println(y.salary);
		System.out.println(y.experience);
	}
}