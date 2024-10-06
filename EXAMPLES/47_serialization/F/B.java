import java.io.*;

class B{
	public static void main(String[] args){
		try{
			Employee e = (Employee)(new ObjectInputStream(
										new FileInputStream("a.txt")
									).readObject());
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.address.cityName);
			System.out.println(e.address.stateName);
			System.out.println(e.address.pin);
		}catch(FileNotFoundException e){
			e.printStackTrace();	
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}