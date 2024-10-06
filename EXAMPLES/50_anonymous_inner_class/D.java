abstract class X{
	abstract void pro();
}

class D{
	public static void main(String[] args){
		X t = new X(){
						void pro(){
							System.out.println("+++++++");
						}
					 };	

		t.pro();
	}
}