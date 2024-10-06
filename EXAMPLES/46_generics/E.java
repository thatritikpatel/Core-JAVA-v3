import java.util.ArrayList;

class E{
	public static void main(String[] args){
		Rent<Car> rc = new Rent<Car>();
		rc.add(new Car());
		Car c = rc.remove();

		Rent<Bus> rb = new Rent<Bus>();
		rb.add(new Bus());
		Bus b = rb.remove();

		rc.add(new Bus());
	}
}

class Car{ }

class Bus{ }

class Rent<T>{
	ArrayList<T> records = new ArrayList<T>();
	
	void add(T element){
		records.add(element);
	}

	T remove(){
		return records.remove(0);
	}
}