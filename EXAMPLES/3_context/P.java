class Circle{
	int radius;
	static float pi = 3.14f;

	void calcArea(){
		System.out.println(pi * radius * radius);
	}

	static void defCircle(){
		System.out.println("Circle is a ....");
	}

	public static void main(String[] args){
		Circle c1 = new Circle();

		c1.pi = 3.1416f;

		System.out.println(c1.pi);
	}
}