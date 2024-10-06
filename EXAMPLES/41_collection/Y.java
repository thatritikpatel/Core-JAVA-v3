class Y{
	public static void main(String[] args){
		Y a = new Y();

		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		System.out.println(Integer.toHexString(a.hashCode()));
	}

	public String toString(){
		return "Hello";
	}

	public int hashCode(){
		return 12;
	}
}

