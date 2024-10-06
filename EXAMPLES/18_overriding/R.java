class A{
	static public void pro(){
	
	}
}

class B extends A{
	//according to the method-overriding rules:
	//access control must be same or wider on an overriding method.
	//Narrower access control is applied 
	//Compilation will fail
	static protected void pro(){
	
	}
}