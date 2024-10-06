import java.util.ArrayList;

class Z{
	public static void main(String[] args){
		//ArrayList<? super Dog> x = new ArrayList<Dog>();
		//or
		//ArrayList<? super Dog> x = new ArrayList<Animal>();
		//or
		//ArrayList<? super Dog> x = new ArrayList<LivingBeing>();
		//or
		//ArrayList<? super Dog> x = new ArrayList<Object>();

		//x.add(new Animal());
		//x.add(new Cow());
		//x.add(new Cat());
		//x.add(new Dog()); //OK
		//x.add(new BDog()); //OK
	}
}