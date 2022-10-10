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
public class CekGanjilGenap {
    
    public static void main(String[] args){
        CekGanjilGenap cekGanjilGenap = new CekGanjilGenap();
         Scanner input = new Scanner(System.in);
        int nilai;
        
        System.out.println("_________________________");
        System.out.println("CEK GANJIL GENAP ");
        System.out.println("_________________________");
        System.out.println("Masukkan angka : ");
        nilai = input.nextInt();
       cekGanjilGenap.hasilBilangan(nilai);
    }
    
    private void hasilBilangan(int nilai){
        if(nilai / 2 == 1 ){
            System.out.println(nilai + " merupakan bilangan genap");
        } else{
            System.out.println(nilai + " merupakan bilangan ganjil");
        }
    }
    
}
