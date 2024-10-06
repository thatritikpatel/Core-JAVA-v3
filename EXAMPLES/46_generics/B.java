import java.util.ArrayList;

class B{
	public static void main(String[] args){
		ArrayList<? extends X> x = new ArrayList<Y>();
	}
}

interface X{ }

class Y implements X{ }