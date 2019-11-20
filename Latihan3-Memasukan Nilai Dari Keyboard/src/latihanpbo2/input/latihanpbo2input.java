/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo2.input;
import java.util.Scanner;

/**
 *
 * @author  Rivaldi
 * Nama   : Rivaldi
 * NIM    : A2.1900155
 * Kelas  : TI-B
 * Deskripsi :
 */
public class latihanpbo2input {
    /**
     * @param args  the command line arguments
     * 
     * 
     */
    public static void main(String[] args){
         System.out.print("Masukan Nama Anda: ");
        Scanner Scanner = new Scanner (System.in);
        
        String nama  = Scanner.next();
        System.out.println ("Nama Anda  "+ nama  );
        
    }
    
}
