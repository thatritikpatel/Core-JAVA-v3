import java.sql.*;

class H{
	public static void main(String[] arsg){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

			String query = "select * from students";

			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
		
			while(rs.next()){
				System.out.println("ID:"+rs.getInt(1)+" Name:"+rs.getString(2)+" Email:"+rs.getString(3)+" Phone:"+rs.getString(4));
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}	
	}
}