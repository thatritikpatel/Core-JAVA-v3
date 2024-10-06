import java.io.IOException;

class X{
	void pro() throws IOException{
	
	}
}

class J extends X{
	//Same exception declared in throws clause
	//Allowed: legal method overriding
	void pro() throws IOException{
	
	}
}