import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
		Address a = new Address();
		a.cityName = "Jabalpur";
		a.stateName = "MP";
		a.pin = "482002";

		Employee emp = new Employee();
		emp.name = "mahesh";
		emp.age = 35;
		emp.address = a;

		new ObjectOutputStream(
			new FileOutputStream("a.txt")	
		).writeObject(emp);
	}
}