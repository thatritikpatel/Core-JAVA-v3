import java.io.*;

class G{
	public static void main(String[] args){
		try{
			if(12<13)
				throw new FileNotFoundException();
			else
				throw new IOException();
		}catch(IOException e){
		
		}catch(FileNotFoundException e){
		
		}
	}
}