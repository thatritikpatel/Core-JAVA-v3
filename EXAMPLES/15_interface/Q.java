class Car{

}

interface Jumpable{
	void jumpingFactor();
	void jumpingStyle();
}

class SportsCar extends Car implements Jumpable{
	public void jumpingFactor(){}
	public void jumpingStyle(){}
}