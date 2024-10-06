//legal method overriding(parameter body matched(try to change return type))

class X{
	void pro(int x){
	
	}
}

class G extends X{
	//Case 1:
	/*
	void pro(int y){
		
	}*/
	
	//Case 2:
	/*
	int pro(int y){
		return 12;
	}*/
}