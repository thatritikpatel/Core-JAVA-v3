import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class X{
	void pro() throws ArithmeticException{
	
	}
}

class P extends X{
	//throws-clause(Narrower/Fewer/Wider/Newer) not applicable on method overloading
	void pro(int u) throws RuntimeException{
	
	}
}