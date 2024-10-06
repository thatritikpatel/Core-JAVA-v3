class X{
	enum CoffeeSize{
		SMALL,MEDIUM,LARGE
	}
}


class T{
	public static void main(String[] args){
		//Case 2:
		X.CoffeeSize v = X.CoffeeSize.SMALL;
		System.out.println(v);
		
		//Case 1:
		//CoffeeSize v = CoffeeSize.SMALL;
	}
}