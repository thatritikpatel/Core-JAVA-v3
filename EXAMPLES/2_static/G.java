class Circle{
	int radius;
	static float pi = 3.14f;

	void defineCircle(){
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
		
		//defineCircle();

		//c1.defineCircle();
		//c2.defineCircle();
		//c3.defineCircle();
	}
}