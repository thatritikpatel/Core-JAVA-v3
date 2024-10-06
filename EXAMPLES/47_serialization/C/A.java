import java.io.*;

class A{
	public static void main(String[] args){
		City ct = new City("Jabalpur");

		State st = new State("MP");

		Address addr = new Address(ct,st,"482002"); 

		Student s = new Student("mohan",13,addr);
		
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("abc.txt")));
			oos.writeObject(s);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}