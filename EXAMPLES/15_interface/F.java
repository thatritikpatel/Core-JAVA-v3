interface X{
	int y = 90;	//y is implicitly final, that is why you must initialize-
				//when declaring.
}

class F{
	public static void main(String[] args){
		System.out.println(X.y); //y is implicitly a static varibale

		//X.y = 99;  //y is implicitly final.
	}
}