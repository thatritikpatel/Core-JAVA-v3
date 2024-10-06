import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class A{
	public static void main(String[] args){
		Shape a = new Shape();
		a.length = 10;
		a.width = 20;
		a.height = 30;

		File file = new File("om.txt");

		try{
			FileOutputStream fos = new FileOutputStream(file);

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(a);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

class Shape{
	int length;
	int width;
	int height;
}