package servicios;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    public Connection connect(){
        try{
            final String USER = "root",
                    PASSWORD = "root",
                    DBNAME = "sys",
                    TIMEZONE = "America/Mexico_City",
                    USESSL = "false",
                    PUBLICKEY = "true",
                    HOST = "localhost",
                    PORT = "3306";
            String dataSource = String.format("jdbc:mysql://%s:%s/%s?user=%s&password=%s&serverTimezone=%s&useSSL=%s&allowPublicKeyRetrieval=%s",
                    HOST,PORT,DBNAME,USER,PASSWORD,TIMEZONE,USESSL,PUBLICKEY);
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection(dataSource);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection conn = new MySQLConnection().connect();
        if (conn != null){
            System.out.println("Exito");

        }else {
            System.out.println("Error");
        }
    }
}