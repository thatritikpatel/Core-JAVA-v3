class Vehicle{  }

class Bus extends Vehicle{}

class Car extends Vehicle{  }

class SportsCar extends Car{  }

class Apple{ }

class E{
	public static void main(String[] args){
		Vehicle v = new SportsCar();//Polymorphic Assignment
		
		//Case 6:
		
		if(v instanceof Bus){
			System.out.println("SportsCar is a Bus");
		}else{
			System.out.println("SportsCar is not a Bus");
		}
		
		
		
		//Case 5:
		/*
		if(v instanceof Apple){
			System.out.println("SportsCar is a Apple");
		}else{
			System.out.println("SportsCar is not a Apple");
		}
		*/
		
		//Case 4:
		/*
		if(v instanceof Object){
			System.out.println("SportsCar is a Object");
		}else{
			System.out.println("SportsCar is not a Object");
		}*/
		
		
		//Case 3:
		/*
		if(v instanceof Vehicle){
			System.out.println("SportsCar is a Vehicle");
		}else{
			System.out.println("SportsCar is not a Vehicle");
		}*/

		//Case 2:
		/*
		if(v instanceof Car){
			System.out.println("SportsCar is a Car");
		}else{
			System.out.println("SportsCar is not a Car");
		}*/
		
		//Case 1:
		/*
		if(v instanceof SportsCar){
			System.out.println("SportsCar is a SportsCar");
		}else{
			System.out.println("SportsCar is not a SportsCar");
		}*/
	}
}