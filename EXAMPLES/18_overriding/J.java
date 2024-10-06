class A{
	int pro(int x){
		return 1;
	}
}

class B extends A{
	//Method Overriding
	//Compilation will Pass
	//Parameter Body Exactly matched 
	//and the return type also matched
	int pro(int x){
		return 1;
	}
}