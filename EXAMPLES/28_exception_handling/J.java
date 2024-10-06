class J{
	public static void main(String[] args){ 
		//int x = 12/0;

		Animal a = new Cat();
		Dog d = (Dog)a;
	}
}

class Animal{  }
class Cat extends Animal{ }
class Dog extends Animal{ }