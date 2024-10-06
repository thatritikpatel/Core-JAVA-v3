interface X{ 
	void pro();
}

class Y implements X{
	public void pro(){
		System.out.println("pro() in Y");
	}
}

class B{
	public static void main(String[] args){
		X t = new Y();
		t.pro();
	}
}