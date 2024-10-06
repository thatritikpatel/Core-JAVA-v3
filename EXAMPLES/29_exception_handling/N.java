import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class X{
	void pro() throws IOException{
	
	}
}

class N extends X{
	//Fewer exception declared in throws clause
	//Allowed: legal method overriding
	//Ignore the unchecked exceptions in throws clause
	void pro() throws ClassCastException{
	
	}
}