class A{
	private void pro(){
	
	}
}

class B extends A{
	//this is just a coincidence that we created
	//a method with the same name in the child class
	//not method overriding
	/*private*/ /*protexted*/ /*public*/ int pro(){
		return 0;
	}
}