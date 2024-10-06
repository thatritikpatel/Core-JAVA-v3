class Circle{
	int radius;
	static float pi = 3.14f;

	static void defineCircle(){
		System.out.println("Circle is a......");
	}
	
	void calcArea(){
		System.out.println(pi * radius * radius);
	}	

	void calcPerimeter(){
		System.out.println(2 * pi * radius);
	}

	public static void main(String[] args){

		Circle c1 = new Circle();
		c1.radius = 10;

		Circle c2 = new Circle();
		c2.radius = 100;

		Circle c3 = new Circle();
		c3.radius = 200;
		
		System.out.println(getPI());
		System.out.println(c1.getPI());
		System.out.println(c2.getPI());
		System.out.println(c3.getPI());
	}

	static float getPI(){
		return pi;
	}
}