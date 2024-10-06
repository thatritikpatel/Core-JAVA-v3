import java.io.*;

class A{
	public static void main(String[] args){
		Employee x = new Employee("om",34,new Address("Rewa","MP","340023"));

		try{
			new ObjectOutputStream(
				new FileOutputStream("a.txt")	
			).writeObject(x);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}