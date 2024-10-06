class G{
	public static void main(String[] args){
		Student s1 = new Student("mohan",12);
		Student s2 = new Student("mohan",12);
		Student s3 = new Student("mohan",12);
		Student s4 = new Student("ravi",13);

		//null test:
		//System.out.println(s1.equals(null));
		//System.out.println(s2.equals(null));
		//System.out.println(s3.equals(null));
		//System.out.println(s4.equals(null));

		//It is consistent:
		//System.out.println(s1.equals(s4));
		//System.out.println(s1.equals(s4));
		//System.out.println(s1.equals(s4));
		
		//It is transitive:
		//System.out.println(s1.equals(s2));
		//System.out.println(s2.equals(s3));
		//System.out.println(s1.equals(s3));
		
		//It is symmetric:
		//System.out.println(s1.equals(s2));
		//System.out.println(s2.equals(s1));

		//It is reflexive:
		//System.out.println(s1.equals(s1));
		//System.out.println(s2.equals(s2));
		//System.out.println(s3.equals(s3));
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
		boolean flag = false;
		
		if(o instanceof Student){
			Student s1 = this;
			Student s2 = (Student)o;

			String nm1 = s1.name;
			String nm2 = s2.name;

			flag = nm1.equals(nm2);
		}

		return flag;
	}
}