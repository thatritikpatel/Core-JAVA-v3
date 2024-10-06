class X{
	public static void main(String[] args){
		X a = new X();

		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		System.out.println(Integer.toHexString(a.hashCode()));
	}
}

