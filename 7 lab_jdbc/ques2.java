import java.sql.*;
import java.util.*;

public class ques2{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","password");

Statement stmt=con.createStatement();
System.out.println("------------Login Page---------------");
System.out.println("1.Student");
System.out.println("2.Faculty");
Scanner scanner = new Scanner(System.in);
int i = scanner.nextInt();
if (i==1){
System.out.println("Enter username");
String user=scanner.next();
System.out.println("Enter pass");
String pass=scanner.next();
ResultSet r1=stmt.executeQuery("select pass from login where un='"+user+"';");
if(r1.next())
	   {
 if(pass.equals(r1.getString(1))){
System.out.println("------------Entering as student---------------");
System.out.println("1.Update contact info");
int x=scanner.nextInt();
if (x==1){
System.out.println("Enter roll number to update contact");
String y=scanner.next();
System.out.println("Enter phone to update");
String z=scanner.next();
stmt.executeUpdate("update student set phone='"+z+"'where rn="+y+";");
System.out.println("------------updated---------------");
}
else{
System.out.println("give valid option");
}}
else{
System.out.println("Enter crt password");
}
}
}
else if(i==2){
System.out.println("Enter username");
String user=scanner.next();
System.out.println("Enter pass");
String pass=scanner.next();
ResultSet r3=stmt.executeQuery("select pass from login where un='"+user+"';");
if(r3.next())
	   {
 if(pass.equals(r3.getString(1))){
System.out.println("------------Entering as faculty---------------");
System.out.println("1.Enter values");
System.out.println("2.update info");
int p=scanner.nextInt();
if (p==2){
System.out.println("Enter roll number to update contact");
int y=scanner.nextInt();
System.out.println("Enter phone to update");
String z=scanner.next();
stmt.executeUpdate("update student set phone='"+z+"'where rn="+y+";");
System.out.println("------------updated---------------");
}
else if(p==1){
System.out.println("Enter roll number");
int q=scanner.nextInt();
System.out.println("Enter name");
String r=scanner.next();
System.out.println("Enter mark1");
int s=scanner.nextInt();
System.out.println("Enter mark2");
int t=scanner.nextInt();
System.out.println("Enter mark3");
int u=scanner.nextInt();
System.out.println("Enter mark4");
int v=scanner.nextInt();
System.out.println("Enter mark5");
int w=scanner.nextInt();
System.out.println("Enter phone");
String o=scanner.next();
stmt.executeUpdate("insert into student values("+q+",'"+r+"',"+s+","+t+","+u+","+v+","+w+",'"+o+"';");
System.out.println("------------inserted---------------");
}
}
else{
System.out.println("give valid option");
}}else{
System.out.println("Enter crt password");
}
}
con.close();
}catch(Exception e){ System.out.println(e);}

}
}
