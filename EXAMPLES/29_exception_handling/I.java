import java.io.IOException;

class X{
	void pro() throws IOException{
	
	}
}

class I extends X{
	//Fewer exception declared in throws clause
	//Allowed: legal method overriding
	void pro(){
	
	}
}