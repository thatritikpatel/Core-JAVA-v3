enum CoffeeSize{
	SMALL(100,"AA"),MEDIUM(200,"B"),LARGE(300,"A+");

	private int ml;
	private String grade;

	CoffeeSize(int ml,String grade){
		this.ml = ml;
		this.grade = grade;
	}

	int getML(){
		return ml;
	}

	String getGrade(){
		return grade;
	}
}

class R{
	public static void main(String[] args){
		CoffeeSize[] arr = CoffeeSize.values();

		for(CoffeeSize tmp : arr){
			System.out.println(tmp+" ---- "+tmp.getML()+" ############ "+tmp.getGrade());
		}
	}
}