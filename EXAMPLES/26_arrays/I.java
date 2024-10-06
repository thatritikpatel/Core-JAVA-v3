class I{
	public static void main(String[] args){
		Animal[] x = {
						new Cat(),
						new Dog(),
						new BDog(),
						new Cow()
					 };

		for(Animal tmp : x){
			System.out.println(tmp);
		}
	}
}

interface Animal{ }
class Cat implements Animal{ }
class Cow implements Animal{ }
class Dog implements Animal{ }
class BDog extends Dog{ }