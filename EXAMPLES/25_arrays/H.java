class H{
	public static void main(String[] args){
		Animal x = new Cat();

		Animal[] arr = new Dog[3];
	}
}

class LivingBeing{ }
class Animal extends LivingBeing{ }

class Cat extends Animal{ }
class Dog extends Animal{ }
class Cow extends Animal{ }

class BDog extends Dog{ }