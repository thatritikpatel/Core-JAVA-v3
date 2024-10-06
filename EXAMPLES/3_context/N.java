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
		defCircle();
	}

	public static void main(String[] args){
		Circle c1 = new Circle();
		c1.radius = 53;

		Circle c2 = new Circle();
		c2.radius = 78;

		c1.process();
		c2.process();
	}
}