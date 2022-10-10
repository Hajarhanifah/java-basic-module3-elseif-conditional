/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package module3.hajarhanifah.conditional.gaji;

/**
 *
 * @author hajarhanifah
 */
/**
 * Menentukan gaji pokok dan tunjangan berdasarkan jabatan, dengan kriteria 1.
 * Direktur, gaji pokok Rp. 10.000.000 dan tunjangan Rp.1.000.000 2. Manager,
 * gaji pokok Rp. 7.000.000 dan tunjangan Rp. 750.000 3. SPV, gaji pokok
 * Rp.5.000.000 dan tunjangan Rp. 500.000
 */
public class CekGajiKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form CekGajiKaryawan
     */
    public CekGajiKaryawan() {
        initComponents();
        tfGaPok.setEnabled(false);
        tfTunjangan.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbHeader = new javax.swing.JLabel();
        lbJabatan = new javax.swing.JLabel();
        cbJabatan = new javax.swing.JComboBox<>();
        lbGaPok = new javax.swing.JLabel();
        tfGaPok = new javax.swing.JTextField();
        lbTunjangan = new javax.swing.JLabel();
        tfTunjangan = new javax.swing.JTextField();
        btnBersih = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbHeader.setText("Pernyataan IF - Else");
        lbHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbJabatan.setText("Jabatan");

        cbJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jabatan", "Direktur", "Manager", "Superviser" }));
        cbJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJabatanActionPerformed(evt);
            }
        });

        lbGaPok.setText("Gaji Pokok");

        tfGaPok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGaPokActionPerformed(evt);
            }
        });

        lbTunjangan.setText("Tunjangan");

        tfTunjangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTunjanganActionPerformed(evt);
            }
        });

        btnBersih.setText("Bersih");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbJabatan)
                            .addComponent(lbGaPok)
                            .addComponent(lbTunjangan))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbJabatan, 0, 186, Short.MAX_VALUE)
                            .addComponent(tfGaPok)
                            .addComponent(tfTunjangan)
                            .addComponent(btnBersih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(lbHeader)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJabatan)
                    .addComponent(cbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGaPok)
                    .addComponent(tfGaPok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTunjangan)
                    .addComponent(tfTunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnBersih)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJabatanActionPerformed
        String jabatan = (String) cbJabatan.getSelectedItem();

        if (jabatan.equals("Direktur")) {
            tfGaPok.setText("10.000.000");
            tfTunjangan.setText("1.000.000");
        } else if (jabatan.equals("Manager")) {
            tfGaPok.setText("7.000.000");
            tfTunjangan.setText("750.000");
        } else if (jabatan.equals("Superviser")) {
            tfGaPok.setText("5.000.000");
            tfTunjangan.setText("500.000");
        } else {
            tfGaPok.setText("");
            tfTunjangan.setText("");
        }
    }//GEN-LAST:event_cbJabatanActionPerformed

    private void tfGaPokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGaPokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGaPokActionPerformed

    private void tfTunjanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTunjanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTunjanganActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        cbJabatan.setSelectedIndex(0); // combo box akan kembali ke index 0  (pilih jabatan) saat menekan tombol "BERSIH"
        tfGaPok.setText("");
        tfTunjangan.setText("");
    }//GEN-LAST:event_btnBersihActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CekGajiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekGajiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekGajiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekGajiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekGajiKaryawan().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersih;
    private javax.swing.JComboBox<String> cbJabatan;
    private javax.swing.JLabel lbGaPok;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbJabatan;
    private javax.swing.JLabel lbTunjangan;
    private javax.swing.JTextField tfGaPok;
    private javax.swing.JTextField tfTunjangan;
    // End of variables declaration//GEN-END:variables
}
