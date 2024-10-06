class Shape{
	int length;
	int width;
	int height;

	{
		System.out.println("Do it first...right now...");
	}
	
	Shape(int length){		
		this.length = length;
	}

	Shape(int length, int width){
		this.length = length;
		this.width = width;
	}

	Shape(int length,int width,int height){			
		this.length = length;
		this.width = width;
		this.height = height;
	}
}

class I{
	public static void main(String[] args){
		Shape shape = new Shape(33);
		System.out.println(shape.length);
		System.out.println(shape.width);
		System.out.println(shape.height);
	}
}