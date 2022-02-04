package SQLconnection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ClientTest{
public static void main(String[] args) throws SQLException{
Connection connection=DBUtil1.getConnection();
if(connection!=null) 
	System.out.println("JDBC:connection is taken..");
Statement st = connection.createStatement();
String sql="select * from register";
ResultSet rs= st.executeQuery(sql);
while(rs.next())

{
System.out.println(rs.getString(1));;
System.out.println(rs.getString(2));;
System.out.println(rs.getString(3));;
System.out.println(rs.getString(4));;

}
try{
connection.close();
 st.close();
}
catch(Exception e)
{
System.out.println(e);;
}
}

public static void update(Statement st,String query)
{
	try
	{
	int executeUpdate = st.executeUpdate(query);
	System.out.println("No. of row effected: "+executeUpdate);
	}catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
}
}