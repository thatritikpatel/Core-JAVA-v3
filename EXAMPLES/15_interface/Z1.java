interface T{
	void pqr();
}

class U implements T{
	public void pqr(){
		System.out.println("+++");
	}
}

class W extends U implements T{

}