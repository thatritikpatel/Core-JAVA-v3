class G{
	public static void main(String[] args){
		System.out.println("----1");
		try{
			System.out.println("----2");

			int i = Integer.parseInt(args[0]);

			System.out.println("----3");

			String[] x = {"mohan",null,"ganesh","om"};
			System.out.println(x[i].length());
			
			System.out.println("----4");

			int y = 12/i;
		
			System.out.println("----5");
		}catch(NumberFormatException e){
			System.out.println("NFE");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("AIOOBE");
		}catch(NullPointerException e){
			System.out.println("NPE");
		}catch(ArithmeticException e){
			System.out.println("AE");
		}

		System.out.println("---- 6");
	}
}