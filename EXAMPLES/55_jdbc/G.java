import java.sql.*;

class G{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

			String query = "insert into states (state_name) values ('Maharashtra'),('Karnataka'),('Kerla'),('Tamilnadu')";
			
			PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);

			System.out.println(ps.executeUpdate()+" new records added");
			
			ResultSet rs = ps.getGeneratedKeys();

			while(rs.next()){
				System.out.println(rs.getInt(1));
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}