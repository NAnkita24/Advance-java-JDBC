package JDBC;
import java.io.FileInputStream;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

public class FirstJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
	Statement st=con.createStatement();
//	st.execute("create table family( name varchar(20),age int(3),rollNo int(4))");
	
	PreparedStatement ptst=con.prepareStatement("insert into family(name,age,rollNo)values(?,?,?)");
	System.out.println("Enter name: ");
	String name=sc.next();
	
	System.out.println("Enter age: ");
	int age=sc.nextInt();
	
	System.out.println("Enter rollNo: ");
	int roll=sc.nextInt();
	
	ptst.setString(1, name);
	ptst.setInt(2, age);
	ptst.setInt(3, roll);
	FileInputStream fis=new FileInputStream("");
	ptst.setBinaryStream(4, null, roll)
	ptst.executeUpdate();
}
}
