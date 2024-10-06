class A{
	protected void pro(){
	
	}
}

class B extends A{
	//Compilation will Pass
	//Same or Wider Access Acontrol Is Allowed
	/*public*/ /*protected*/ void pro(){
		
	}
}