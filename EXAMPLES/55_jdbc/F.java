import java.sql.*;
import java.io.Console;

class F{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/schooldb?user=root&password=1234");

			String query = "insert into students (name,email,phone) value (?,?,?)";

			PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);

			Console cn = System.console();
			
			System.out.print("Enter your Name: ");
			ps.setString(1,cn.readLine());

			System.out.print("Enter your Email: ");
			ps.setString(2,cn.readLine());

			System.out.print("Enter your Phone: ");
			ps.setString(3,cn.readLine());			
			

			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();
			
			if(rs.next()){
				System.out.println(rs.getInt(1));
			}
			
			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}