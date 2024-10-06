import java.util.ArrayList;

class A{
	public static void main(String[] args){
		ArrayList<Animal> x = new ArrayList<Animal>();

		x.add(new Animal());
		x.add(new Cat());
		x.add(new Cow());
		x.add(new Dog());
		x.add(new BDog());

		System.out.println(x);
	}
}

class LivingBeing{ }

class Animal extends LivingBeing{ }

class Cat extends Animal{ }
class Cow extends Animal{ }
class Dog extends Animal{ }

class BDog extends Dog{ }