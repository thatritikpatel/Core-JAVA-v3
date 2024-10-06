interface Drinkable{
	void offerDrinkable();
}

class MilkShake implements Drinkable{
	public void offerDrinkable(){
		System.out.println("serving milkshake...");
	}
}

class Water implements Drinkable{
	public void offerDrinkable(){
		System.out.println("serving water...");
	}
}

class Tea implements Drinkable{
	public void offerDrinkable(){
		System.out.println("serving tea...");
	}
}

class Coffee implements Drinkable{
	public void offerDrinkable(){
		System.out.println("serving coffee...");
	}	
}

class Host{
	void serveDrink(Drinkable drinkable){
		drinkable.offerDrinkable();
	}

	/*
	void serveDrink(Water water){
		water.offerDrinkable();
	}	

	void serveDrink(Tea tea){
		tea.offerDrinkable();
	}

	void serveDrink(Coffee coffee){
		coffee.offerDrinkable();
	}*/
}

class X{
	public static void main(String[] args){
		Host host = new Host();

		Water water = new Water();
		host.serveDrink(water);
		
		Tea tea = new Tea();
		host.serveDrink(tea);

		Coffee coffee = new Coffee();
		host.serveDrink(coffee);

		MilkShake milkShake = new MilkShake();
		host.serveDrink(milkShake);
	}
}