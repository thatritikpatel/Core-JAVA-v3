import java.io.*;

class G1{
	public static void main(String[] args){
		try{
			if(12<13)
				throw new FileNotFoundException();
			else
				throw new IOException();
		}catch(FileNotFoundException e){
		
		}catch(IOException e){
		
		}
	}
}