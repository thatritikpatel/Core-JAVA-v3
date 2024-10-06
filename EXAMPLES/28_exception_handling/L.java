import java.io.FileNotFoundException;
import java.io.FileReader;

class L{
	public static void main(String[] args) /*throws FileNotFoundException*/{
		System.out.println("----- E");
		abc();
	}

	static void abc() /*throws FileNotFoundException*/{
		System.out.println("----- R");
		mno();
	}

	static void mno() /*throws FileNotFoundException*/{
		System.out.println("----- C");
		pqr();
	}

	static void pqr() /*throws FileNotFoundException*/{
		System.out.println("----- M");
		FileReader fr = new FileReader("abc.txt");
	}
}