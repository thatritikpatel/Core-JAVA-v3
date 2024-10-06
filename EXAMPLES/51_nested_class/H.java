class X{
	static class Y{
		void pro(){
			System.out.println("Hello");
		}
	}
}

class H{
	public static void main(String[] args){
				
		//Case 4:
		X.Y t = new X.Y();
		t.pro();
		
		//Case 3:
		//X.Y t = new Y();

		//Case 2:
		//X.Y t;
		
		//Case 1:
		//Y t;
	}
}