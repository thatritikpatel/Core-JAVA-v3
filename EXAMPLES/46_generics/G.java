class G{
	<T> G(T x){
		System.out.println(x);
	}

	public static void main(String[] args){		
		Cat t = new Cat();
		G a = new G(t);

		Bus s = new Bus();
		G b = new G(s);
	}
}

class Cat{ }

class Bus{ }