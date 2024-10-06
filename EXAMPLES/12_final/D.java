final class X{
	int w = 56;
}

class D /*extends X*/{
	public static void main(String[] args){
		X x = new X();
		x.w = 12;

		System.out.println(x.w);
	}
}