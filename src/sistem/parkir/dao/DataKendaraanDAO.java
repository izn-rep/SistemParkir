/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.parkir.dao;
import sistem.parkir.model.DataKendaraan;
import sistem.parkir.utilities.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author izani
 */
public class DataKendaraanDAO {
    
    private static final Logger logger = Logger.getLogger(DataKendaraanDAO.class.getName());
    
    private Connection m_connection;
    private static final String CREATE_STATEMENT = "insert into DataKendaraan ( JenisKendaraan, NoPolisi, JamMasuk, JamKeluar, TanggalMasuk, TanggalKeluar, LamaParkir, TarifParkir) values ( ?, ?, ?, ?, ?, ?, ?, ?)";
    
    private static Connection CONNECTION;
    private static DataKendaraanDAO INSTANCE;
    
    public DataKendaraanDAO (Connection connection) throws SQLException{
        m_connection = connection;
        
        try {
            if (CONNECTION == null) {
                CONNECTION = Koneksi.bukakoneksi();
               }
        } catch (SQLException ex) {
            
        }
    }
    
    public static DataKendaraanDAO getInstance () {
        if (INSTANCE == null) {
            try {
                INSTANCE = new DataKendaraanDAO(CONNECTION);
            } catch (SQLException ex) {
                Logger.getLogger(DataKendaraanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return INSTANCE;
    }
    
    public DataKendaraan createKendaraan(DataKendaraan value) throws DataException{
        
        PreparedStatement _ps = null;
        try {
            _ps = m_connection.prepareStatement(CREATE_STATEMENT);
            _ps.setString(1, value.getJenisKendaraan());
            _ps.setString(2, value.getNoPolisi());
            _ps.setString(3, value.getJamMasuk());
            _ps.setString(4, value.getJamKeluar());
            _ps.setDate(5, (java.sql.Date)value.getTanggalMasuk());
            _ps.setDate(6, (java.sql.Date)value.getTanggalKeluar());
            _ps.setString(7, value.getLamaParkir());
            _ps.setInt(7, value.getTarifParkir());
            
            
            if (_ps.executeUpdate()>0)
                return value;
            
        } catch(SQLException e){
            e.printStackTrace();
            throw new DataException(e);
        } finally{
            try {
                _ps.close();
            } catch (SQLException ex) {
                
            }
        }
        return value;
    }
    
    private DataKendaraan populateKendaraan (ResultSet _rs) throws SQLException {
        DataKendaraan _nilai = new DataKendaraan();
        _nilai.setJenisKendaraan(_rs.getString("JenisKendaraan"));
        _nilai.setNoPolisi(_rs.getString("NoPolisi"));
        _nilai.setJamMasuk(_rs.getString("JamMasuk"));
        _nilai.setJamKeluar(_rs.getString("JamKeluar"));
        _nilai.setTanggalMasuk(_rs.getDate("TanggalMasuk"));
        _nilai.setTanggalKeluar(_rs.getDate("TanggalKeluar"));
        _nilai.setLamaParkir(_rs.getString("LamaParkir"));
        
         return _nilai;
    }
}
