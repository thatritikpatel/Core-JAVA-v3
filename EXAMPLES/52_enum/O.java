enum CoffeeSize{
	SMALL(100),MEDIUM(200),LARGE(300);

	int ml;

	CoffeeSize(int ml){
		this.ml = ml;
	}
}

class O{
	public static void main(String[] args){
		System.out.println(CoffeeSize.MEDIUM.ml);

		CoffeeSize.MEDIUM.ml = 250;

		System.out.println(CoffeeSize.MEDIUM.ml);
	}
}