package day6;
import java.sql.*;
import java.util.*;
public class Program1_JDBC {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, username, password);
		int id = 1;
		String query = "select * from employee where empid>=?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1,id);
		ResultSet result = statement.executeQuery();
		while(result.next()) {
			System.out.println(result.getInt("empid")+" "+result.getString("empname"));
		}
	}
}
