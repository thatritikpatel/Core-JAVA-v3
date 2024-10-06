import java.io.*;

class A{
	public static void main(String[] args){
		Student s = new Student("ram",22,"MTech",992);

		try{
			new ObjectOutputStream(
				new FileOutputStream(
					new File("mno.txt")
				)
			).writeObject(s);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}