import java.util.TreeMap;

class E{
	public static void main(String[] args){
		TreeMap map = new TreeMap();

		map.put(new College("JEC","Jabalpur"),new Student("mohan",23));
		map.put(new College("Shree RAM","Bhopal"),new Student("ganesh",13));
		map.put(new College("Global","Indore"),new Student("mayank",19));
		map.put(new College("JEC","Jabalpur"),new Student("kartik",11));

		System.out.println(map);
	}
}

class College{
	String collegeName;
	String city;

	College(String collegeName, String city){
		this.collegeName = collegeName;
		this.city = city;
	}

	public String toString(){
		return collegeName+"~"+city;
	}
}

class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"~"+age;
	}
}