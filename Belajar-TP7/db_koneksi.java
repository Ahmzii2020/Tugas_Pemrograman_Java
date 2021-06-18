  
// Nama     : Ahmad Fauzi
// NIM      : 11200930000020
// Prodi    : Sistem Informasi
// Fakultas : Sains dan Teknologi
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ahmad Fauzi
 */
public class db_koneksi {
    private Connection koneksi;
    
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        }   catch (ClassNotFoundException ex){
            System.out.println ("Gagal Koneksi"+ex);
        }
        
        String url ="jdbc:mysql://localhost:3306/db_projek";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database");
        }   catch (SQLException ex){
            System.out.println("Gagal Koneksi Database"+ex);
        }
        return koneksi;
    }
}
