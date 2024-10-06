class E{
	public static void main(String[] args){
		Animal a = new Animal();
		Cat b = new Cat();
		Cow c = new Cow();
		Dog d = new Dog();
		BDog e = new BDog();
		LivingBeing f = new Cat();
		
		
		Animal[] x = {new Cat(),a,b,c,d,e,f};

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
}


class LivingBeing{ }
class Animal extends LivingBeing{ }

class Cat extends Animal{ }
class Dog extends Animal{ }
class Cow extends Animal{ }

class BDog extends Dog{ }