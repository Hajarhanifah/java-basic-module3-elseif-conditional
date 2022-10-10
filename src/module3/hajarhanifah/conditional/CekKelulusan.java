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
public class CekKelulusan {

    public static void main(String[] args) {
        String hasil = "";
        String dataNilai = JOptionPane.showInputDialog("Masukkan nilai anda = ");
        float nilai = Float.parseFloat(dataNilai);
        if(nilai > 70){
            hasil = "Anda Lulus!!";
        } else {
            hasil = "Anda Tidak Lulus";
        }
        
        System.out.println(hasil);
    }

}
