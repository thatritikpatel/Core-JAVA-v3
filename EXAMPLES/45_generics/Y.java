import java.util.ArrayList;

class Y{
	public static void main(String[] args){
		//ArrayList<? super Dog> x = new ArrayList<Dog>();
		//ArrayList<? super Dog> x = new ArrayList<Animal>();
		//ArrayList<? super Dog> x = new ArrayList<LivingBeing>();
		//ArrayList<? super Dog> x = new ArrayList<Object>();
		ArrayList<? super Dog> x = new ArrayList<BDog>();
	}
}

class LivingBeing{ }

class Animal extends LivingBeing{ }

class Cat extends Animal{ }
class Cow extends Animal{ }
class Dog extends Animal{ }

class BDog extends Dog{ }