//Case 4:
class Q{
	final int y;

	Q(){
		//super();
		//<create variable y in the current object>
		y = 90; 
	}
}

//Case 3:
/*
class Q{
	final int y = 67;
}*/


//Case 2:
/*
class Q{
	final int y;

	Q(){
		super();
		//---- y initialization expected
		//Q.java:8: error: variable y might not have been initialized
        //}
        //^
	}
}*/


//Case 1:
/*
class Q{
	final int y;
	//Q.java:2: error: variable y not initialized in the default constructor
        //final int y;
					^
}*/