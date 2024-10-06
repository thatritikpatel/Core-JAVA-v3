import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class X{
	void pro() throws IOException{
	
	}
}

class M extends X{
	//Narrower exception declared in throws clause
	//Allowed: legal method overriding
	void pro() throws FileNotFoundException,EOFException{
	
	}
}