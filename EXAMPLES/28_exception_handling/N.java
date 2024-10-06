import java.io.FileReader;
import java.io.FileNotFoundException;

class X{
	X(){
		System.out.println("R");
	}
}

class N extends X{
	N() /*throws FileNotFoundException*/{
		System.out.println("J");
		FileReader fr = new FileReader("abc.txt");
	}
	
	public static void main(String[] args) /*throws FileNotFoundException*/{
		System.out.println("W");
		N n = new N();
	}
}