class A{
	static void pro(){
	
	}
}

class B extends A{
	//overridden method is static
	//then the overriding method must be declared static
	//compilation will fail
	void pro(){
		
	}
}