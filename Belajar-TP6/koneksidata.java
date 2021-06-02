// Nama     : Ahmad Fauzi
// NIM      : 11200930000020
// Kelas    : 2A Sistem Informasi
// Tanggal  : 2 Juni 2021
package Koneksidatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Ahmad Fauzi
 */
public class koneksidata {
   private Connection koneksi;
    
    public Connection connect(){
     try{
    Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
    } catch (ClassNotFoundException ex){
            System.out.println("Gagal Koneksi" + ex);
    }
    String url = "jdbc:mysql://localhost:3306/admin_lumbung";
    try{
    koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil Koneksi Database");
    } catch (SQLException ex){
            System.out.println("Gagal Koneksi Database" + ex);
    }
    return koneksi;
    }
}