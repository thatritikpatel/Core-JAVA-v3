
class M{
	public static void main(String[] args) {
		System.out.println("----- E");
		abc();
	}

	static void abc(){
		System.out.println("----- R");
		mno();
	}

	static void mno(){
		System.out.println("----- C");
		pqr();
	}

	static void pqr() /*throws ClassCastException*/{
		System.out.println("----- M");
		Animal a = new Cat();
		Dog d = (Dog)a;
	}
}

class Animal { }
class Cat extends Animal{ }
class Dog extends Animal{ }
