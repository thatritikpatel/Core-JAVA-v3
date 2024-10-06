public class D{
	//Case 4:
	
	public D(){
		System.out.println("private constructor D");		
	}

	//Case 3:
	/*
	protected D(){
		System.out.println("protected constructor D");
	}*/
	
	//Case 2:
	/*
	private D(){
		System.out.println("private constructor D ~~~");
	}*/

	//Case 1:
	/*
	D(){
		System.out.println("private constructor D");
	}*/

	public static void main(String[] args){
		new D();
	}
}