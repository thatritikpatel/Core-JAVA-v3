class R1{
	public static void main(String[] args){
		Student s1 = new Student("om",10);
		Student s2 = new Student("om",10);

		System.out.println(s1==s2);

		System.out.println(s1.equals(s2));
	}
}