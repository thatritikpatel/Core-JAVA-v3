import java.util.TreeMap;

class G{
	public static void main(String[] args){
		TreeMap<College,Student> map = new TreeMap<College,Student>();

		map.put(new College("JEC","Jabalpur"),new Student("mohan",23));
		map.put(new College("Shree RAM","Bhopal"),new Student("ganesh",13));
		map.put(new College("Global","Indore"),new Student("mayank",19));
		map.put(new College("JEC","Jabalpur"),new Student("kartik",11));

		System.out.println(map);
	}
}

class College implements Comparable<College>{
	String collegeName;
	String city;

	College(String collegeName, String city){
		this.collegeName = collegeName;
		this.city = city;
	}

	public String toString(){
		return collegeName+"~"+city;
	}

	public int compareTo(College o){
		String nm1 = this.collegeName;
		String nm2 = o.collegeName;

		return nm1.compareTo(nm2);
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