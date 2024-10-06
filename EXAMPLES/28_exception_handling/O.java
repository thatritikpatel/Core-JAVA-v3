import java.io.FileReader;
import java.io.FileNotFoundException;

class T{
	T()/* throws FileNotFoundException*/{
		System.out.println("Y");
		FileReader fr = new FileReader("abc.txt");
	}
}

class O extends T{
	O() /*throws FileNotFoundException*/{
		super();
	}

	public static void main(String[] args) /*throws FileNotFoundException*/{
		System.out.println("E");
		O x = new O();
		System.out.println("R");
	}
}