package jdbc;

import java.sql.*;
import java.util.Scanner;  
public class ProcedureCall {  
public static void main(String[] args) {  
	try{ 
	Scanner s=new Scanner(System.in);
     System.out.print("Enter ID : ");
     int id=s.nextInt();
     /*System.out.print("Enter Name : ");
     s.nextLine();
     String name=s.nextLine();*/

    Class.forName("oracle.jdbc.driver.OracleDriver");  

    Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
  
    CallableStatement stmt=con.prepareCall("{call fetch_rec(?,?)}"); 
    stmt.setInt(1,id);
    stmt.registerOutParameter(2, Types.VARCHAR);
    stmt.execute();
    System.out.println("Name="+stmt.getString(2));  
		System.out.println("success");

} catch(Exception e){
	System.out.println(e);
}
	} 
}  
/* 1  create or replace procedure fetch_rec(p_empno number, p_empname out varchar2)
  2   IS
  3  begin
  4    select empname into p_empname from empl where empid=p_empno;
  5* end;
 * 
 * 
 * 
 * 
 * 
 */

/*create or replace procedure ADD_DEPT(p_deptno number, p_dname out varchar2)
  3   IS
  4    begin
  5   select department_name into p_dname from departments where department_id=p_deptno;
  6*  end;*/