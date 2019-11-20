/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6kambingstaticdankonstanta;

/**
 *
 * @author USER
 * Nama   : Santi
 * NIM    : A2.1900167
 * Kelas  : TI-B
 * Deskripsi :
 * 
 */
public class mamalia {
    // variabel jumlahkambing dideklarasikan sebagai statik
public static int jumlahkambing;    


// NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";

  
    public static void main(String[] args) {
    mamalia.jumlahkambing = 485000;
    System.out.println( NAMA_KAMBING + "memiliki kambing sebanyak "
                        + mamalia.jumlahkambing);
}
    
}
