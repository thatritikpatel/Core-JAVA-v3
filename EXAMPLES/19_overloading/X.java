//legal method overloading (parameter type mismatched)

class E{
	void pro(int x){
		System.out.println("pro int param");
	}

	void pro(byte y){
		System.out.println("pro byte param");		
	}
} 

class X{
	public static void main(String[] args){		
		//Case 2:
		//byte b = 23;
		//new E().pro(b);
		
		//Case 1:
		//new E().pro(23);
	}
}