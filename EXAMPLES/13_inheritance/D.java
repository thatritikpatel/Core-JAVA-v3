class Animal{ }

class Dog extends Animal{ }

class BDog extends Dog{  }

class D{
	public static void main(String[] args){
		BDog x = new BDog();
		
		System.out.println(x instanceof BDog);
		System.out.println(x instanceof Dog);
		System.out.println(x instanceof Animal);
		System.out.println(x instanceof Object);
	}
}