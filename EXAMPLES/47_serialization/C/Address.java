import java.io.Serializable;

class Address implements Serializable{
	City city;
	State state;
	String pin;

	Address(City city,State state,String pin){
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
}