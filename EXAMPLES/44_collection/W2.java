import java.util.Arrays;

class W2{
	public static void main(String[] args){
		Employee[] x = {
						new Employee("hareesh",34),
						new Employee("om",23),
						new Employee("chetan",29),
						new Employee("ganesh",25),
						new Employee("abhay",31)
					  };
		
		for(Employee tmp : x)
			System.out.print(tmp+" ");

		Arrays.sort(x);

		System.out.println();

		for(Employee tmp : x)
			System.out.print(tmp+" ");
	}
}

class Employee{
	String name;
	int age;

	Employee(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"^"+age;
	}
}