class D{
	public static void main(String[] args){
		//3.
		/*
		Student a1 = new Student("mohan",12);
		Student a2 = new Student("sohan",12);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode()+"-"+a2.hashCode());
		*/
		Student a1 = new Student("mohan",12);
		Student a2 = new Student("hanmo",12);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode()+"-"+a2.hashCode());


		//2.
		/*
		Student a1 = new Student("mohan",12);
		Student a2 = new Student("mohan",12);
		Student a3 = new Student("mohan",12);

		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode()+"-"+a2.hashCode());

		System.out.println(a2.equals(a3));
		System.out.println(a2.hashCode()+"-"+a3.hashCode());

		System.out.println(a1.equals(a3));
		System.out.println(a1.hashCode()+"-"+a3.hashCode());
		*/

		//1.
		//Student x = new Student("mohan",12);
		//System.out.println(x.hashCode());
		//System.out.println(x.hashCode());
		//System.out.println(x.hashCode());
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
		return name+"-"+age;
	}

	public boolean equals(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.equals(nm2);
	}

	public int hashCode(){
		String abc = " abcdefghijklmnopqrstuvwxyz"; 

		int sum = 0;

		for(int i=0;i<name.length();i++){
			sum += abc.indexOf(name.charAt(i));
		}

		return sum;
	}
}