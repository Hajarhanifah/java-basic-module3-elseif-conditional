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
public class KonversiNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        
        System.out.println("_________________________");
        System.out.println("kONVERSI NILAI ");
        System.out.println("_________________________");
        System.out.println("Masukkan nilai : ");
        nilai = input.nextInt();
        cekNilai(nilai);
        
    }
    
    private static void cekNilai(int nilai){
        if(nilai >= 85 && nilai <= 100){
            System.out.println("Nilai anda : A");
        }else if(nilai >= 70 && nilai <= 84){
              System.out.println("Nilai anda : B");
        }else if(nilai >=60 && nilai <70){
              System.out.println("Nilai anda : C");
        } else if(nilai >= 50 && nilai <50){
              System.out.println("Nilai anda : E");
        }
    }
}
