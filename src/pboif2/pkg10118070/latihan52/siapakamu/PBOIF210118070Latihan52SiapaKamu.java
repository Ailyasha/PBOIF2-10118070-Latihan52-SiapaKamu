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
public class PBOIF210118070Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118070");
        mahasiswa.setNama("Aufa Ilyasha");
        mahasiswa.setUmur(20);
        mahasiswa.setKelas("PBO2");
        
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println("\nNIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
