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

/**
*  Soal : Buatlah sebuah program untuk mengecek apakah bilangan yang diinput 
* adalah bilangan POSITIF, NEGATIF, atau NOL
*/
public class CekBilangan {
    
    public static void main(String[] args){
        CekBilangan cekBilangan = new CekBilangan();
         Scanner input = new Scanner(System.in);
        int bilangan;
        
        System.out.println("_________________________");
        System.out.println("CEK BILANGAN ");
        System.out.println("_________________________");
        System.out.println("Masukkan angka : ");
        bilangan = input.nextInt();
       cekBilangan.hasilBilangan(bilangan);
    }
    
    private void hasilBilangan(int bilangan){
        if(bilangan >0 ){
            System.out.println(bilangan + " merupakan bilangan positif");
        } else if ( bilangan <0 ){
            System.out.println(bilangan + " merupakan bilangan negatif");
        } else if( bilangan == 0){
            System.out.println(bilangan + " =  Nol ");
        }
    }
}
