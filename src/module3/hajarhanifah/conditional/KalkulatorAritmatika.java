/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module3.hajarhanifah.conditional;

import javax.swing.JOptionPane;

/**
 *
 * @author hajarhanifah
 */
public class KalkulatorAritmatika {

    private int nilaiA = 100;
    private int nilaiB = 25;

    public static void main(String[] args) {
        KalkulatorAritmatika kalkulatorAritmatika = new KalkulatorAritmatika();
        int pilihan;
        String dataPilihan = "";

        System.out.println("_______________________");
        System.out.println("Kalkulator Aritmatika Sederhana");
        System.out.println("nilai A = 100 dan nilai B = 25");
        System.out.println("_______________________");
        System.out.println("Menu Pilihan");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("_______________________");
        dataPilihan = JOptionPane.showInputDialog("Masukkan pilihan anda (1-4)");
        pilihan = Integer.parseInt(dataPilihan);
        kalkulatorAritmatika.cekHasil(pilihan);
    }

    private void cekHasil(int pilihan) {
        int hasil;
        switch (pilihan) {
            case 1:
                hasil = nilaiA + nilaiB;
                System.out.println("Penjumlahan " + nilaiA + " + " + nilaiB + " = " + hasil);
                break;
            case 2:
                hasil = nilaiA - nilaiB;
                System.out.println("Pengurangan " + nilaiA + " - " + nilaiB + " = " + hasil);
                break;
            case 3:
                hasil = nilaiA * nilaiB;
                System.out.println("Perkalian " + nilaiA + " x " + nilaiB + " = " + hasil);
                break;
            case 4:
                hasil = nilaiA / nilaiB;
                System.out.println("Pembagian " + nilaiA + " : " + nilaiB + " = " + hasil);
                break;
            default:
                System.out.println("Pilihan anda salah! ");
                break;
        }
    }

}
