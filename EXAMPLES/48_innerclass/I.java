class I{
	class J{

	}

	public static void main(String[] args){
		I i1 = new I();

		J j1 = i1.new J();
		J j2 = i1.new J();

		I i2 = new I();

		J j3 = i2.new J();
	}
}