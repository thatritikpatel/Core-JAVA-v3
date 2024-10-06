class W{
	public static void main(String[] args){
		int x=10,y=5,z=0;

		System.out.println("x:"+x+" - y:"+y);

		z = x;
		x = y;
		y = z;

		System.out.println("x:"+x+" - y:"+y);
	}
}