class F1{
	public static void main(String[] args){
		try{
			String s = "mohan";
			int[] x = {12,45,67,89};

			//System.out.println(s.charAt(5));
			System.out.println(x[4]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("AIOOBE");
			System.out.println(e);
		}catch(IndexOutOfBoundsException e){
			System.out.println("IOOBE");
			System.out.println(e);
		}
	}
}