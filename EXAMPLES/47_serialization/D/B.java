import java.io.*;

class B{
	public static void main(String[] args){
		try{
			Student s = (Student)(new ObjectInputStream(
									new FileInputStream(
										new File("mohan.txt")
									)
								   ).readObject()
								  );

			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.degree);
			System.out.println(s.marks);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}