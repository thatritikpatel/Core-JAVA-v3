class Animal{ }

class Dog extends Animal{  }

class BDog extends Dog{  }

class B{
	public static void main(String[] args){
		BDog a = new BDog();
		Dog b = new BDog();
		Animal c = new BDog();
		Object o = new BDog();

	}
}