class H{
	public static void main(String[] args){
		System.out.println("Y");

		try{
			System.out.println("R");
		}
		System.out.println("H");	
		catch(Exception e){
			System.out.println("Q");
		}
		System.out.println("I");	
		catch(Exception e){
			System.out.println("M");
		}
		System.out.println("Y");
		finally{
			System.out.println("T");
		}
	}
}