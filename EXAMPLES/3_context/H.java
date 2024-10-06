class Circle{
	int radius;
	static float pi = 3.14f;

	void calcArea(){
		System.out.println(pi * radius * radius);
	}

	static void defCircle(){
		System.out.println("Circle is a ....");
	}

	void process(){
		System.out.println(radius);
	}

	public static void main(String[] args){
		Circle c1 = new Circle();
		c1.radius = 34;

		Circle c2 = new Circle();
		c2.radius = 56;

		c2.process();
		c1.process();
	}
}