import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

class A{
	public static void main(String[] args){
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

			String query = "insert into students (name,email,phone) value ('Mohan','mohan@gmail.com','9098579690')";
			
			PreparedStatement ps = con.prepareStatement(query);

			ps.executeUpdate();
				
			con.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}