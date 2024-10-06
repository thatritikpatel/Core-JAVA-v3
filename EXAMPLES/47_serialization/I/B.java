import java.io.*;

class B{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Employee emp = (Employee)(new ObjectInputStream(
										new FileInputStream("a.txt")
									).readObject());

		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.address.cityName);
		System.out.println(emp.address.stateName);
		System.out.println(emp.address.pin);
	}
}