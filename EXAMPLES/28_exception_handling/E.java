import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

class E{
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("abc.txt");	

		FileReader fr = new FileReader(f);
	}
}