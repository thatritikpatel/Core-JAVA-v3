class Shape{
	int length;
	int width;
	int height;
	
	Shape(int length){
		System.out.println("Do it first...now");
		this.length = length;
	}

	Shape(int length, int width){
		System.out.println("Do it first...now");
		this.length = length;
		this.width = width;
	}

	Shape(int length,int width,int height){	
		System.out.println("Do it first...now");
		this.length = length;
		this.width = width;
		this.height = height;
	}
}

class H{
	public static void main(String[] args){
		Shape shape = new Shape(33,23);
		System.out.println(shape.length);
		System.out.println(shape.width);
		System.out.println(shape.height);
	}
}