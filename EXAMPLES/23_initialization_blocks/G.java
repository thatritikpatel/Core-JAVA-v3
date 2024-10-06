class G{
	{
		System.out.println("C");
	}

	{
		System.out.println("A");
	}

	{
		System.out.println("B");
	}

	public static void main(String[] args){
		System.out.println("X");
		G g = new G();
		System.out.println("Y");
	}
}