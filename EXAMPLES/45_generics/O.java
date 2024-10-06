class O{
	public static void main(String[] args){
		Cat a = new Cat();
		pro(a);

		Cow b = new Cow();
		pro(b);

		Dog c = new Dog();
		pro(c);
	}

	static void pro(Animal x){
		System.out.println(x);
	}

	/*
	static void pro(Cat x){
		System.out.println(x);
	}

	static void pro(Cow x){
		System.out.println(x);
	}

	static void pro(Dog x){
		System.out.println(x);
	}*/
}

class Animal{ }

class Cat extends Animal{ }
class Dog extends Animal{ }
class Cow extends Animal{ }