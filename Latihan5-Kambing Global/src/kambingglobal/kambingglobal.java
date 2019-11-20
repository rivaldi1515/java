/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingglobal;

/**
 *
 * @author USER
 * Nama   : Rivaldi
 * NIM    : A2.1900155
 * Kelas  : TI-B
 * Deskripsi :
 * 
 */
public class kambingglobal {
 
    //variabel jumlah kambing menjadi variabel instance
    int jumlahKambing = 88;

public void getJumlahKambing(){
    System.out.println("Jumlah Kambing: "+ jumlahKambing); 
}
public void tambahKambing(){
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kambingglobal kambingsusu = new kambingglobal();
       
        //menampilkan jumlah kambing yang ada saat program pertama  x berjalan
        kambingsusu.getJumlahKambing();
        //menambah satu kambing
        kambingsusu.tambahKambing();
        //menampilkan jumlah kambing yang ada
        kambingsusu.getJumlahKambing();
    }
    }  
   
