class I{
	public static void main(String[] args){
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		Dog d = new Dog();
		
		Animal[] x = new Cat[4];
		x[0] = c1;
		x[1] = c2;
		x[2] = c3;
		x[3] = d;
		
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);
	}
}


class Animal extends LivingBeing{ }

class Cat extends Animal{ }
class Dog extends Animal{ }