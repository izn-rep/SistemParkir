/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.parkir.model;
import java.util.Date;
/**
 *
 * @author izani
 */
public class DataKendaraan {

        private String JenisKendaraan;
        private String NoPolisi;
        private String JamMasuk;
        private String JamKeluar;
        private Date TanggalMasuk;
        private Date TanggalKeluar;
        private String LamaParkir;
        private int TarifParkir;

    public String getJamKeluar() {
        return JamKeluar;
    }

    public void setJamKeluar(String JamKeluar) {
        this.JamKeluar = JamKeluar;
    }

    public String getJamMasuk() {
        return JamMasuk;
    }

    public void setJamMasuk(String JamMasuk) {
        this.JamMasuk = JamMasuk;
    }

    public String getJenisKendaraan() {
        return JenisKendaraan;
    }

    public void setJenisKendaraan(String JenisKendaraan) {
        this.JenisKendaraan = JenisKendaraan;
    }

    public String getLamaParkir() {
        return LamaParkir;
    }

    public void setLamaParkir(String LamaParkir) {
        this.LamaParkir = LamaParkir;
    }

    public String getNoPolisi() {
        return NoPolisi;
    }

    public void setNoPolisi(String NoPolisi) {
        this.NoPolisi = NoPolisi;
    }

    public Date getTanggalKeluar() {
        return TanggalKeluar;
    }

    public void setTanggalKeluar(Date TanggalKeluar) {
        this.TanggalKeluar = TanggalKeluar;
    }

    public Date getTanggalMasuk() {
        return TanggalMasuk;
    }

    public void setTanggalMasuk(Date TanggalMasuk) {
        this.TanggalMasuk = TanggalMasuk;
    }

    public int getTarifParkir() {
        return TarifParkir;
    }

    public void setTarifParkir(int TarifParkir) {
        this.TarifParkir = TarifParkir;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DataKendaraan other = (DataKendaraan) obj;
        if ((this.NoPolisi == null) ? (other.NoPolisi != null) : !this.NoPolisi.equals(other.NoPolisi)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.NoPolisi != null ? this.NoPolisi.hashCode() : 0);
        return hash;
    }
        
        
}
