/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.publicclasssoalke2;

/**
 *
 * @author Afrelian
 */
public class Publicclasssoalke2 {

    public static void main(String[] args) {
        
        String nama="budi santoso";
        double kalkulus=80;
        double pti=90;
        double daspor=80;
        double nilai_rata=(kalkulus+pti+daspor)/3;
        int nilai_rata2=(int) (kalkulus+pti+daspor)/3;
        
        
        System.out.println("Nilai Double Rata kanan "+nama+" Adalah "+nilai_rata);
        System.out.println("Nilai integer Rata kanan "+nama+" Adalah "+nilai_rata2);
        
        //konfersi Integer Ke String
        String a=String.valueOf(nilai_rata2); 
        String hasil="Nilai Rata Rata"+nama+" Adalah "+a;
        System.out.println("Hasil Konfersi String Ke Integer "+hasil);
        
        //konfersi Srting Ke Double
        double b=Double.parseDouble(a);
        System.out.println("Hasil Konfersi String Ke Double "+b);
        
        //Konfersi String Ke Integer
        int c=Integer.parseInt(a);
        System.out.println("Hasil Konfersi String Ke Integer "+c);
        
        //Casting Integer ke Double
        double d=(double)c;
        System.out.println("Hasil CaSting Integer Ke Double "+d);
        int e=(int)d;
        System.out.println("Hasil Casting Double Ke Integer "+e);
        
        
        
        
    }
}
