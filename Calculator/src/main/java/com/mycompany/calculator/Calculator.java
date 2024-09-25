package com.mycompany.calculator;
import javax.swing.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        // Membuat frame baru
        JFrame frame = new JFrame("Kalkulator");

        // Membuat JLabel untuk label input angka pertama dan kedua serta hasil
        JLabel labelAngkaPertama = new JLabel("Masukkan Angka Pertama:");
        JLabel labelAngkaKedua = new JLabel("Masukkan Angka Kedua:");
        JLabel labelHasil = new JLabel("Hasil:");

        // Membuat JTextField untuk input angka pertama dan kedua serta untuk menampilkan hasil
        JTextField angkaPertama = new JTextField();
        JTextField angkaKedua = new JTextField();
        JTextField hasil = new JTextField();
        hasil.setEditable(false); // Supaya pengguna tidak bisa mengedit hasil

        // Membuat tombol operasi aritmatika
        JButton tambah = new JButton("+");
        JButton kurang = new JButton("-");
        JButton kali = new JButton("*");
        JButton bagi = new JButton("/");

        // Mengatur posisi dan ukuran komponen
        labelAngkaPertama.setBounds(50, 30, 200, 20);
        angkaPertama.setBounds(50, 50, 150, 20);

        labelAngkaKedua.setBounds(50, 80, 200, 20);
        angkaKedua.setBounds(50, 100, 150, 20);

        labelHasil.setBounds(50, 130, 200, 20);
        hasil.setBounds(50, 150, 150, 20);

        tambah.setBounds(50, 200, 50, 50);
        kurang.setBounds(110, 200, 50, 50);
        kali.setBounds(170, 200, 50, 50);
        bagi.setBounds(230, 200, 50, 50);

        // Menambahkan komponen ke frame
        frame.add(labelAngkaPertama);
        frame.add(angkaPertama);
        frame.add(labelAngkaKedua);
        frame.add(angkaKedua);
        frame.add(labelHasil);
        frame.add(hasil);
        frame.add(tambah);
        frame.add(kurang);
        frame.add(kali);
        frame.add(bagi);

        // Mengatur ukuran frame dan tampilannya
        frame.setSize(350, 350);
        frame.setLayout(null);
        frame.setVisible(true);

        // Listener untuk operasi penjumlahan
        tambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mengambil nilai dari JTextField angkaPertama dan angkaKedua
                int num1 = Integer.parseInt(angkaPertama.getText());
                int num2 = Integer.parseInt(angkaKedua.getText());

                // Menghitung hasil penjumlahan
                int sum = num1 + num2;

                // Menampilkan hasil di JTextField hasil
                hasil.setText("Hasil: " + String.valueOf(sum));
            }
        });

        // Listener untuk operasi pengurangan
        kurang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(angkaPertama.getText());
                int num2 = Integer.parseInt(angkaKedua.getText());
                int diff = num1 - num2;
                hasil.setText("Hasil: " + String.valueOf(diff));
            }
        });

        // Listener untuk operasi perkalian
        kali.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(angkaPertama.getText());
                int num2 = Integer.parseInt(angkaKedua.getText());
                int product = num1 * num2;
                hasil.setText("Hasil: " + String.valueOf(product));
            }
        });

        // Listener untuk operasi pembagian
        bagi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(angkaPertama.getText());
                int num2 = Integer.parseInt(angkaKedua.getText());
                if (num2 != 0) {
                    int quotient = num1 / num2;
                    hasil.setText("Hasil: " + String.valueOf(quotient));
                } else {
                    hasil.setText("Tidak bisa dibagi nol");
                }
            }
        });
    }
}
 

