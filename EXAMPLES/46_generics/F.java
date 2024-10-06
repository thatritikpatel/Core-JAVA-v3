class F{
	public static void main(String[] args){
		F f = new F();

		f.pro(new Animal());
		f.pro(new Car());
	}

	<T> void pro(T x){
		System.out.println(x);
	}
}

class Animal{ }

class Car{ }