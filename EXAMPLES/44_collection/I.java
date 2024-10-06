import java.util.TreeMap;
import java.util.Comparator;

class I{
	public static void main(String[] args){
		TreeMap<College,Student> map = new TreeMap<College,Student>(new NameSort());

		map.put(new College("JEC","Jabalpur"),new Student("mohan",23));
		map.put(new College("Shree RAM","Bhopal"),new Student("ganesh",13));
		map.put(new College("Global","Indore"),new Student("mayank",19));
		map.put(new College("JEC","Jabalpur"),new Student("kartik",11));

		System.out.println(map);
	}
}

class NameSort implements Comparator<College>{
	public int compare(College o1,College o2){

		String nm1 = o1.collegeName;
		String nm2 = o2.collegeName;

		return nm1.compareTo(nm2);
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