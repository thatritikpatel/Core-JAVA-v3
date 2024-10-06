class A{
	final void pro(){
	
	}
}

class B extends A{
	//you can't override a final method ...
	//Compilation Fail
	void pro(){
	
	}
}