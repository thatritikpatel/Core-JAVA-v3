interface C{ }

class A{ }

class D extends A implements C{ }

interface B extends C{ }

class E extends A implements B{  }

class F extends D implements B{ }

class H{
	public static void main(String[] args){
		F x = new F();

		System.out.println(x instanceof F);
		System.out.println(x instanceof D);
		System.out.println(x instanceof B);
		System.out.println(x instanceof C);
		System.out.println(x instanceof A);
		//System.out.println(x instanceof E);
		System.out.println(x instanceof Object);
	}
}