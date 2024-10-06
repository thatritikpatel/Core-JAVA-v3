interface X{ 
	void pro();
}

/*
class Y implements X{
	public void pro(){
		System.out.println("pro() in Y");
	}
}*/

class C{
	public static void main(String[] args){
		X t = new X(){
						public void pro(){
							System.out.println("pro() in MLAIC");
						}
					};

		t.pro();
	}
}