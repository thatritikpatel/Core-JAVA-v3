import java.io.*;

class A{
	public static void main(String[] args){
		Student s = new Student("om",21,"BTech",897);

		try{
			new ObjectOutputStream(
				new FileOutputStream(
					new File("mohan.txt")
				)
			).writeObject(s);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}