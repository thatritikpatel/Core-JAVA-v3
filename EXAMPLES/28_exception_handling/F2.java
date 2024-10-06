class F2{
	public static void main(String[] args){
		try{
			Class klass = Class.forName("A");
		}catch(ClassNotFoundException e){
			System.out.println("##############");
		}

		System.out.println("ok");
	}
}