import java.io.IOException;

class X{
	void pro() throws IOException{
	
	}
}

class K extends X{
	//Newer exception declared in throws clause
	//Not Allowed: Illegal method overriding
	void pro() throws ClassNotFoundException{
	
	}
}