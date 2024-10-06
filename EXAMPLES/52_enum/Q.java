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

class Q{
	public static void main(String[] args){
		CoffeeSize[] arr = CoffeeSize.values();

		for(CoffeeSize tmp : arr){
			System.out.println(tmp+" ---- "+tmp.getML());
		}
	}
}