class X{
	X(int y){
		System.out.println("S");
	}
}

class T extends X{
	T(){
		//super();
		super(12);
	}

	public static void main(String[] args){
		System.out.println("W");
		T t = new T();
		System.out.println("I");
	}
}