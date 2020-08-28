import java.sql.*;

class ques1{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","password");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from student");

while(rs.next())
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+rs.getInt(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+rs.getInt(7)+"  "+rs.getString(8));

con.close();

}catch(Exception e){ System.out.println(e);}

}
