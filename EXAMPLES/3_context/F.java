class Circle{
	int radius;
	static float pi = 3.14f;

	void calcArea(){
		System.out.println(pi * radius * radius);
	}
	
	static void defCircle(){
		System.out.println("Circle is a.....");
	}

	static void process(){
		System.out.println(Circle.pi);
	}

	public static void main(String[] args){
		process();
	}
}