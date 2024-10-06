class V{
	static void pro(Animal... x){
		
	}
	
	public static void main(String... args){
		pro(new Cat(),new Dog(),new BDog(),new Animal());
	}
}

class Animal{ }

class Cat extends Animal{ }

class Dog extends Animal{ }

class BDog extends Dog{ }