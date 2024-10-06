class K{
	static int x = 90;

	static{
		System.out.println("class init block - "+x);
	}

	public static void main(String[] args){
		System.out.println("inside main");
	}
}