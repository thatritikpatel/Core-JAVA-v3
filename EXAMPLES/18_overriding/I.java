class A{
	int pro(int x){
		return 2;
	}
}

class B extends A{
	//Illegal Method Overriding
	//Compilation will Fail
	//Parameter Body Exactly matches 
	//but the return type mismatched
	long pro(int x){
		return 1L;
	}
}