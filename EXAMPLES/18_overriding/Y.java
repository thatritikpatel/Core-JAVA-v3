class Car{
	void driveCar(){
		System.out.println("Drive Car...");
	}
}

class SportsCar extends Car{
	void driveCar(){
		System.out.println("Drive Sports Car...");
	}
}

class LuxuryCar extends Car{
	void driveCar(){
		System.out.println("Drive Luxury Car...");
	}
}

class SpaceCar extends Car{
	void driveCar(){
		System.out.println("Drive Space Car...");
	}
}

class CarRental{
	SportsCar rentSportsCar(){
		SportsCar sc = new SportsCar();
		
		return sc;
	}

	LuxuryCar rentLuxuryCar(){
		LuxuryCar lc = new LuxuryCar();

		return lc;
	}

	SpaceCar rentSpaceCar(){
		SpaceCar sc = new SpaceCar();

		return sc;
	}
}

class Y{
	public static void main(String[] args){
		CarRental cr = new CarRental();
				
		SportsCar sc = cr.rentSportsCar();
		sc.driveCar();

		LuxuryCar lc = cr.rentLuxuryCar();
		lc.driveCar();

		SpaceCar spc = cr.rentSpaceCar();
		spc.driveCar();
	}
}