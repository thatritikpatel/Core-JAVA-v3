import java.sql.*;

class B{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/schooldb?user=root&password=1234");

			String query = "insert into students (name,email,phone) value (?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1,args[0]);
			ps.setString(2,args[1]);
			ps.setString(3,args[2]);

			ps.executeUpdate();

		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}