/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module3.hajarhanifah.conditional;

import java.util.Scanner;

/**
 *
 * @author hajarhanifah
 */
public class NilaiDetermian {

    public static void main(String[] args) {
        NilaiDetermian nilaiDeterminan = new NilaiDetermian();
        Scanner input = new Scanner(System.in);
        int nilaiA, nilaiB, nilaiC;

        System.out.println("_________________________");
        System.out.println("NILAI DETERMINAN ");
        System.out.println("E = A * A - (4 * B * C)");
        System.out.println("_________________________");
        System.out.println("Masukkan Nilai A : ");
        nilaiA = input.nextInt();
        System.out.println("Masukkan Nilai B : ");
        nilaiB = input.nextInt();
        System.out.println("Masukkan Nilai C : ");
        nilaiC = input.nextInt();
        nilaiDeterminan.cekNilaiDeterminan(nilaiA, nilaiB, nilaiC);
    }

    private void cekNilaiDeterminan(int nilaiA, int nilaiB, int nilaiC) {
        int hasil;
        hasil = nilaiA * nilaiA - (4 * nilaiB * nilaiC);
        System.out.println("Nilai E =  " + hasil);
        if (hasil < 0) {
            System.out.println("Nilai Imajinasi  ");
        } else {
            System.out.println("Nilai Real  ");
        }
    }
}
