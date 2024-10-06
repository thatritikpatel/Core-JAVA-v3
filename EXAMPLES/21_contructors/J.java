class J{
	static int count = 0;

	J(){
		count++;
	}

	public static void main(String[] args){
		J a = new J();
		J b = new J();
		J c = new J();
		J d = new J();
		J e = new J();

		System.out.println(c.count);
		System.out.println(b.count);
		System.out.println(d.count);
		System.out.println(e.count);
		System.out.println(a.count);
	}
}