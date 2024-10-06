import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

class D{
	public static void main(String[] args){
		File f = new File("abc.txt");	

		try{
			FileReader fr = new FileReader(f);
		}catch(FileNotFoundException e){
			System.out.println(" xxxxxxxx  ");
		}

		System.out.println(" ~~~~~~~~~~~  ");
	}
}