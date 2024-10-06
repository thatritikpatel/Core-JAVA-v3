enum Days{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY //;
}

class J{
	static Days day = Days.WEDNESDAY;

	public static void main(String[] args){		
		System.out.println(day instanceof Object);
	}
}