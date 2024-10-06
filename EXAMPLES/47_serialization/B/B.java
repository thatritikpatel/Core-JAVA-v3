import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class B{
	public static void main(String[] args){
		File file = new File("om.txt");

		try{
			FileInputStream fis = new FileInputStream(file);

			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Shape s = (Shape)ois.readObject();

			System.out.println(s.length);
			System.out.println(s.width);
			System.out.println(s.height);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}