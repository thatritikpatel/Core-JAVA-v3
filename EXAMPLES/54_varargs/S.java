class S{
	static void pro(float... x){
		for(float e : x){
			System.out.println(e);
		}
	}

	public static void main(String... args){
		pro(12,45,67);
	}
}