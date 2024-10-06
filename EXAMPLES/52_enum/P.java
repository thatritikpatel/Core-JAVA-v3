enum CoffeeSize{
	SMALL(100),MEDIUM(200),LARGE(300);

	private int ml;

	CoffeeSize(int ml){
		this.ml = ml;
	}

	int getML(){
		return ml;
	}
}

class P{
	public static void main(String[] args){
		//System.out.println(CoffeeSize.MEDIUM.ml);
		
		System.out.println(CoffeeSize.MEDIUM.getML());
	}
}