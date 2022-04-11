package library.management.system;
import java.sql.*;  

public class conn
{
    Connection c;
    Statement s;
    public conn()
    {  
        try{  
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
            //	String filename="project7.accdb";
            //	String databaseDriver="jdbc:odbc:Driver={Microsoft Access Driver(*.mdb)};DBQ="+filename+";DriverID=22;READONLY=true"; 
            		
            c =DriverManager.getConnection("jdbc:odbc:project7","","");    
            s =c.createStatement();  
            
           
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    }  
}  
