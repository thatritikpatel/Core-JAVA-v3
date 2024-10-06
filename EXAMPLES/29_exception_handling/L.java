import java.io.IOException;
import java.io.FileNotFoundException;

class X{
	void pro() throws FileNotFoundException{
	
	}
}

class L extends X{
	//Wider exception declared in throws clause
	//Not Allowed: Illegal method overriding
	void pro() throws IOException{
	
	}
}