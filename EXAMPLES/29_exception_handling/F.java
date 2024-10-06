class F{
	public static void main(String[] args){
		try{
			String s = "mohan";
			int[] x = {12,45,67,89};

			System.out.println(s.charAt(5));
			System.out.println(x[4]);
		}catch(IndexOutOfBoundsException e){
			System.out.println("IOOBE");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("AIOOBE");
		}
	}
}