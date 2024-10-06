import java.io.*;

class Employee implements Serializable{
	String name;
	int age;
	
	transient Address address;

	/*
	private void writeObject(ObjectOutputStream oos){
		try{
			oos.defaultWriteObject();
			oos.writeObject(address.cityName);
			oos.writeObject(address.stateName);
			oos.writeObject(address.pin);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream ois){
		try{
			ois.defaultReadObject();
			address = new Address();
			address.cityName = (String)ois.readObject();
			address.stateName = (String)ois.readObject();
			address.pin = (String)ois.readObject();
		}catch(IOException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}*/
}