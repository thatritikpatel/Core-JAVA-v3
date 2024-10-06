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

	Car rentCar(int carType){
		Car car = null;
		
		if(carType==1){
			car = new SportsCar();
		}else if(carType==2){
			car = new LuxuryCar();
		}else if(carType==3){
			car = new SpaceCar();	
		}else{
			System.out.println("Invalid Selection...");
		}

		return car;
	}

	/*
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
	}*/
}

class Z{
	public static void main(String[] args){
		CarRental cr = new CarRental();
				
		//SportsCar sc = cr.rentSportsCar();
		Car sc = cr.rentCar(1);
		sc.driveCar();

		Car lc = cr.rentCar(2);
		lc.driveCar();

		Car spc = cr.rentCar(3);
		spc.driveCar();
	}
}