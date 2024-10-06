class Circle{
	int radius;
	static float pi = 3.14f;
	
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

		c1.calcPerimeter();	
		c2.calcPerimeter();
	}
}