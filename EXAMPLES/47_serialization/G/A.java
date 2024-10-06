import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
		Person p = new Person("om",22,"om@gmail.com",3.45f);
		
		new ObjectOutputStream(new FileOutputStream("a.txt")).writeObject(p);
	}
}