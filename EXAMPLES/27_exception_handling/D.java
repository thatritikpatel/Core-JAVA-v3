class D{
	public static void main(String[] args){
		System.out.println("----- start");

		Animal a = new Cat();
		Dog d = (Dog)a;

		System.out.println("----- end");
	}
}

class Animal{ }
class Cat extends Animal{ }
class Dog extends Animal{ }