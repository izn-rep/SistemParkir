/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package FIX;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author izani
 */

public class Koneksi {
    private static Connection m_connection;

    public Koneksi() {

    }


public static Connection bukakoneksi()throws SQLException {

        Connection con = null;

        String loginUser = "postgres";
        String loginPasswd = "admin";
        String loginUrl = "jdbc:postgresql://127.0.0.1:5432/SistemParkir";

        try
           {
              return bukakoneksi("org.postgresql.Driver", "jdbc:postgresql://127.0.0.1:5432/SistemParkir", "postgres", "admin");
            }
        catch (SQLException se)
            {
               System.err.println("No Connection Open");
               return null;
            }
        catch (Exception ex)
            {
               System.err.println("Could Not open connection");
               return null;
            }

    }

    public static Connection bukakoneksi(String driverName, String url, String userName, String password) throws Exception{
        try{
            if (m_connection == null){
                Class.forName(driverName);
                m_connection = DriverManager.getConnection(url, userName, password);
            }
        }catch(Exception e ){
            throw e;
        }
        return m_connection;

    }
}
