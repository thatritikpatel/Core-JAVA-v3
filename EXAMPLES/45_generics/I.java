import java.util.ArrayList;

class I{
	public static void main(String[] args){
		ArrayList<Number> x = new ArrayList<Number>();

		byte a = 23;
		short b = 456;
		int c = 23456;
		long d = 2323223L;
		float e = 2.34f;
		double f = 3.45;

		x.add(a);
		x.add(b);
		x.add(c);
		x.add(d);
		x.add(e);
		x.add(f);
		
		System.out.println(x);
	}
}