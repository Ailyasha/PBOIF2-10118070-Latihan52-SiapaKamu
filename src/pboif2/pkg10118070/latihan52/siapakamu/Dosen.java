/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan52.siapakamu;

/**
 *
 * @author Ailyasha
 * NAMA     : Aufa Ilyasha
 * Kelas    : IF2
 * NIM      : 10118070
 */
public class Dosen extends Manusia {
    private String nip, mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa() {
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang mengajar"
                + " matakuliah " + mataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
}
