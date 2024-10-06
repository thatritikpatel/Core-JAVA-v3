
class Animal{
	void a1(){
		System.out.println("mehtod a1 defined in class Animal");
	}
}

class Dog extends Animal{
	void a2(){
		System.out.println("method a2 defined in class Dog");
	}
}

class BDog extends Dog{
	void a3(){
		System.out.println("method a3 defined in BDog");
	}
}

class A{
	public static void main(String[] args){
		BDog x = new BDog();
		x.a3();
		x.a2();
		x.a1();
		System.out.println(x.toString());
	}
}