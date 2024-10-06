class F{
	public static void main(String[] args){
		System.out.println("----- 1");

		Animal a = new Cat();
		
		try{
			System.out.println("----- 2");
			Dog d = (Dog)a;
			System.out.println("----- 3");
		}catch(ClassCastException e){
			System.out.println("CCE");
		}
		

		System.out.println("----- 4");
	}
}

class Animal{ }
class Cat extends Animal{ }
class Dog extends Animal{ }