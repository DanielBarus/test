/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelasD;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    private String nama;
    private String alamat;
    private String umur;
    private String nrp;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String alamat, String umur, String nrp) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nama=" + nama + ", alamat=" + alamat + ", umur=" + umur + ", nrp=" + nrp + '}';
    }
    
    
    
}
