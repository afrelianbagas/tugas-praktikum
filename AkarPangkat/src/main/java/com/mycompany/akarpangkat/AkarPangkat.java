/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.akarpangkat;

/**
 *
 * @author Afrelian
 */
public class AkarPangkat {

    public static void main(String [] args) 
    { 
        // Deklarasi variabel
        int a = 10; 
        int b = 2; 
        
        // Menghitung pangkat 2 dari a dan pangkat 3 dari b
        double pangkat2_a = Math.pow(a, 2); // a pangkat 2
        double pangkat3_b = Math.pow(b, 3); // b pangkat 3
        
        // Penjumlahan hasil pangkat keduanya
        double penjumlahan_keduanya = pangkat2_a + pangkat3_b;

        // Menampilkan hasil
        System.out.println("a pangkat 2: " + pangkat2_a);
        System.out.println("b pangkat 3: " + pangkat3_b);
        System.out.println("Penjumlahan keduanya: " + penjumlahan_keduanya);
    } 
}
