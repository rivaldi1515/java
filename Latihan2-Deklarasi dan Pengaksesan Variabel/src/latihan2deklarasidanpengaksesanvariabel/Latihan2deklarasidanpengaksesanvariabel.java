/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2deklarasidanpengaksesanvariabel;

/**
 *
 * @author USER
 * Nama   : Rivaldi
 * NIM    : A2.1900155
 * Kelas  : TI-B
 * Deskripsi : program ini untuk memasukan variabel
 */
public class Latihan2deklarasidanpengaksesanvariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi variabel
    int nilaiInt;
    final double PHI = 3.14; // konstanta uppercase
    boolean nilaiLogika;
    char nilaiKarakter;
    
    // Memberi nilai kevariabel
    nilaiInt = 78;
    nilaiLogika = false;
    nilaiKarakter = 'D';
    
    // Menampilkan hasil
    System.out.println();
    System.out.println("isi variabel nilai = " + nilaiInt);
    System.out.println("isi variabel PHI = " + PHI);
    System.out.println("isi variabel logika= " + nilaiLogika);
    System.out.println("isi variabel karakter= " + nilaiKarakter);
    
    }
    
}
