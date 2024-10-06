final class X{
	void pro(){
		System.out.println("Hello");
	}
}

class E /*extends X*/{
	public static void main(String[] args){
		X t = new X();

		t.pro();
	}
}