import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class X{
	void pro() throws ArithmeticException{
	
	}
}

class O extends X{
	//Same(NO Checked) exception declared in throws clause
	//Allowed: legal method overriding
	//Ignore the unchecked exceptions in throws clause
	void pro() throws RuntimeException{
	
	}
}