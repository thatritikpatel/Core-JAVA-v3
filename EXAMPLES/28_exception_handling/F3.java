class F3{
	public static void main(String[] args){
		try{
			Class klass = Class.forName("A");
		}catch(ClassCastException e){
			System.out.println("##############");
		}/*catch(ClassNotFoundException e){
			System.out.println("##############");
		}*/

		System.out.println("ok");
	}
}