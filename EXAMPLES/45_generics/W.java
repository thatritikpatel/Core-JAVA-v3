import java.util.ArrayList;

class W{
	public static void main(String[] args){
		ArrayList<? extends LivingBeing> x1 = new ArrayList<LivingBeing>();
		ArrayList<? extends LivingBeing> x2 = new ArrayList<Animal>();
		ArrayList<? extends LivingBeing> x3 = new ArrayList<Cat>();
		ArrayList<? extends LivingBeing> x4 = new ArrayList<Cow>();
		ArrayList<? extends LivingBeing> x5 = new ArrayList<Dog>();
		ArrayList<? extends LivingBeing> x6 = new ArrayList<BDog>();
	}
}

class LivingBeing{ }

class Animal extends LivingBeing{ }

class Cat extends Animal{ }
class Cow extends Animal{ }
class Dog extends Animal{ }

class BDog extends Dog{ }