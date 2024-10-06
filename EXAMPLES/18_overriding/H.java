class A{
	void pro(int x){
		
	}
}

class B extends A{
	//Illegal Method Overriding
	//Compilation will Fail
	//Parameter Body Exactly matches 
	//but the return type mismatched
	int pro(int x){		
		return 1;
	}
}