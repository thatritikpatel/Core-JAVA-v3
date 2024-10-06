class A{
	static void pro(Car car){
		System.out.println("Car param pro");
	}

	static void pro(SportsCar sc){
		System.out.println("SportsCar param pro");
	}

	public static void main(String[] args){
		Car car = new SportsCar();
		
		pro(car);	
	}
}

class Car{ 

}

class SportsCar extends Car{ 

}