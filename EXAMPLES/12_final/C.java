final class X{
	int w = 56;
}

class C /*extends X*/{
	public static void main(String[] args){
		X x = new X();
		System.out.println(x.w);
	}
}