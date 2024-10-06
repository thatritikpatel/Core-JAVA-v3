import java.util.ArrayList;

class D{
	public static void main(String[] args){
		RentCar rc = new RentCar();
		rc.addCar(new Car());
		Car c = rc.removeCar();

		RentBus rb = new RentBus();
		rb.addBus(new Bus());
		Bus b = rb.removeBus();
	}
}

class Car{ }

class RentCar{
	ArrayList<Car> cars = new ArrayList<Car>();
	
	void addCar(Car car){
		cars.add(car);
	}

	Car removeCar(){
		return cars.remove(0);
	}
}

class Bus{ }

class RentBus{
	ArrayList<Bus> buses = new ArrayList<Bus>();
	
	void addBus(Bus bus){
		buses.add(bus);
	}

	Bus removeBus(){
		return buses.remove(0);
	}
}