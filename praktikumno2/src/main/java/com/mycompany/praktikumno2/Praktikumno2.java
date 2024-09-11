/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.praktikumno2;

/**
 *
 * @author Afrelian
 */
public class Praktikumno2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 9;
        int e = 2;
        int f = 9;
        int n = 50;
        int hasil, jumlah = 0;
        boolean cek, tes = false;
        String lulus = "";

        //Proses Operator Aritmatika 
        hasil = a + b;
        System.out.println("a + b = " + hasil);

        hasil = a - b;
        System.out.println("a - b = " + hasil);

        hasil = a / b;
        System.out.println("a / b = " + hasil);

        hasil = a * b;
        System.out.println("a * b = " + hasil);

        hasil = a % e;
        System.out.println("a % e = " + hasil);

        //Proses Operator Relasi 
        cek = (b > c);
        System.out.println("b > c = " + cek);

        cek = (b >= c);
        System.out.println("b >= c = " + cek);

        cek = (b < c);
        System.out.println("b < c = " + cek);

        cek = (b <= c);
        System.out.println("b <= c = " + cek);

        cek = (b == c);
        System.out.println(" b == c = " + cek);

        cek = (b != c);
        System.out.println(" b != c = " + cek);

        //Proses Operator Increment Decrement 
        jumlah = (++a);
        System.out.println(" a++ = " + jumlah);

        jumlah = (-a);
        System.out.println("-a = " + jumlah);

        jumlah = (a++);
        System.out.println("a++ = " + jumlah);

        jumlah = (a--);
        System.out.println("a-- = " + jumlah);

        
        System.out.println("a = " + jumlah);

        //Proses Operator Logika 
        tes = (a > b) || (c == f);
        System.out.println("(a > b) || (c==f) = " + tes);

        tes = (a == b) & (b == ++f);
        System.out.println("(a == b) & (b == ++f) = " + tes);

        tes = (b > a) ^ (f == --a);
        System.out.println("(b>a)^(f==--a) = " + tes);
        
        
        //Proses Operator Kondisi
        lulus = (n >=60)?"lulus" : "ngulang"; 
        System.out.println("Status kelulusan :" + lulus);
    }

}
