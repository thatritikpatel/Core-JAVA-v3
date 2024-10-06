import java.util.HashSet;

class C{
	public static void main(String[] args){
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(new Student("mohan",12));
		set.add(new Student("rohan",12));
		set.add(new Student("mohan",12));
		set.add(new Student("sohan",12));
		set.add(new Student("tohan",12));

		System.out.println(set);
		System.out.println(set.size());

		Student t = new Student("sohan",12);
		System.out.println(set.contains(t));
		System.out.println(set.remove(t));
		System.out.println(set);
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
		return name+" - "+age;	
	}

	public int hashCode(){
		String abc = " abcdefghijklmnopqrstuvwxz";
		
		int len = name.length();
		int sum = 0;

		for(int i=0;i<len;i++){
			sum += abc.indexOf(name.charAt(i));
		}

		sum += age;

		return sum;
	}

	public boolean equals(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		String nm1 = s1.name;
		String nm2 = s2.name;

		int ag1 = s1.age;
		int ag2 = s2.age;

		return nm1.equals(nm2)&&ag1==ag2;		
	}
}