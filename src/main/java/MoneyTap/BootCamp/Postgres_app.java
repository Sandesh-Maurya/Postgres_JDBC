
package  MoneyTap.BootCamp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Postgres_app {
    public Connection connect(){
         Connection conn=null;
         try{
             String url = "jdbc:postgresql://localhost/postgres";
             String user = "postgres";
             String password = "qwertyuiop";
             conn= DriverManager.getConnection(url, user, password);
             System.out.println("PostgresSQL Connection Successfull");
         }
         catch (SQLException e){
             System.out.println(e.getMessage());
         }
         return conn;
     }
    public static void main(String[] args) {
        Postgres_app app = new Postgres_app();
        app.connect();
    }

}
