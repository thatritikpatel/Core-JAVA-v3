import java.sql.*;
import java.util.Scanner;

class D{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/schooldb?user=root&password=1234");

			String query = "insert into students (name,email,phone) value (?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter your Name: ");
			String name = sc.next();

			System.out.print("Enter your Email: ");
			String email = sc.next();

			System.out.print("Enter your Phone: ");
			String phone = sc.next();

			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,phone);

			ps.executeUpdate();

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}