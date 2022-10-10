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
public class CekKategoriUmur {

    private String kategori;
    private String dataUmur;

    public static void main(String[] args) {
        CekKategoriUmur cekKategoriUmur = new CekKategoriUmur();
        cekKategoriUmur.cekUmur();
    }

    private void cekUmur() {
        dataUmur = JOptionPane.showInputDialog("Maskukkan umur anda (Dalam tahun) = ");
        float umur = Float.parseFloat(dataUmur);

        if (umur < 5.0f) {
            kategori = "Balita";
        } else if (umur < 12.0f) {
            kategori = "Anak - anak";
        } else if (umur < 18.0f) {
            kategori = "Remaja";
        } else if (umur < 40.0f) {
            kategori = "Dewasa";
        } else if (umur < 60.0f) {
            kategori = "Paruh Baya";
        } else {
            kategori = "Lanjut Usia";
        }

        System.out.println("Umur " + umur + " tahun termasuk dalam kategori " + kategori);
    }

}
