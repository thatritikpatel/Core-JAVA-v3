class A{
	public static void main(String[] args){
		//int[] y = new byte[2]; //NOT-OK
		
		Animal[] x = new Dog[2];  //OK
		x[0] = new Dog();
		x[1] = new Cat();
	}
}

class Animal{ }

class Cat extends Animal{ }

class Dog extends Animal{ }