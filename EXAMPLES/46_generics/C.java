import java.util.ArrayList;

class C{
	public static void main(String[] args){
		//Case 4:
		ArrayList<Object> x1 = new ArrayList<Integer>();
		ArrayList<Object> x2 = new ArrayList<String>();
		ArrayList<Object> x3 = new ArrayList<Number>();
		ArrayList<Object> x4 = new ArrayList<Object>();
		ArrayList<Object> x5 = new ArrayList<Animal>();

		//Case 3:
		//ArrayList x1 = new ArrayList<Integer>();
		//ArrayList x2 = new ArrayList<String>();
		//ArrayList x3 = new ArrayList<Number>();
		//ArrayList x4 = new ArrayList<Object>();
		//ArrayList x5 = new ArrayList<Animal>();
		
		//Case 2:
		//ArrayList<? extends Object> x = new ArrayList<Integer>();
		//ArrayList<? extends Object> x = new ArrayList<String>();
		//ArrayList<? extends Object> x = new ArrayList<Number>();
		//ArrayList<? extends Object> x = new ArrayList<Object>();
		//ArrayList<? extends Object> x = new ArrayList<Animal>();
		
		//Case 1:
		//ArrayList<?> x = new ArrayList<Integer>();
		//ArrayList<?> x = new ArrayList<String>();
		//ArrayList<?> x = new ArrayList<Number>();
		//ArrayList<?> x = new ArrayList<Object>();
		//ArrayList<?> x = new ArrayList<Animal>();
	}
}

class Animal{ }