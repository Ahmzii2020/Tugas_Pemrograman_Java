// Nama     : Ahmad Fauzi
// NIM      : 11200930000020
// Kelas    : 2A Sistem Informasi
// Tanggal  : 3 Mei 2021
// GUI Aplikasi Perhitungan Hari
package apkperhitunganhari;
/**
 *
 * @author Ahmad Fauzi
 */
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class AppDaysCalculation extends javax.swing.JFrame {

    /**
     * Creates new form AppDaysCalculation
     */
    public AppDaysCalculation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hitungLabel = new javax.swing.JLabel();
        tahunLabel = new javax.swing.JLabel();
        bulanLabel = new javax.swing.JLabel();
        tahunTeks = new javax.swing.JTextField();
        bulanCombo = new javax.swing.JComboBox<>();
        hasilLabel = new javax.swing.JLabel();
        hapusBtn = new javax.swing.JButton();
        hitungBtn = new javax.swing.JButton();
        simpanBtn = new javax.swing.JButton();
        keluarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Days Calculation v.0.1");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Days Calculation", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hitungLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hitungLabel.setText("PERHITUNGAN JUMLAH HARI");
        jPanel1.add(hitungLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 420, 40));

        tahunLabel.setText("Tahun");
        jPanel1.add(tahunLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 20));

        bulanLabel.setText("Bulan");
        jPanel1.add(bulanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 40, 20));

        tahunTeks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tahunTeksKeyTyped(evt);
            }
        });
        jPanel1.add(tahunTeks, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, -1));

        bulanCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        bulanCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulanComboActionPerformed(evt);
            }
        });
        jPanel1.add(bulanCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 160, -1));

        hasilLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasilLabel.setText("Jumlah Hari Pada Bulan _____ Tahun _____ Adalah _____");
        jPanel1.add(hasilLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 420, 30));

        hapusBtn.setBackground(new java.awt.Color(255, 255, 0));
        hapusBtn.setText("Hapus");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });
        jPanel1.add(hapusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 80, -1));

        hitungBtn.setBackground(new java.awt.Color(0, 204, 0));
        hitungBtn.setText("Hitung");
        hitungBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungBtnActionPerformed(evt);
            }
        });
        jPanel1.add(hitungBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 90, -1));

        simpanBtn.setBackground(new java.awt.Color(0, 0, 255));
        simpanBtn.setText("Simpan");
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });
        jPanel1.add(simpanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 80, -1));

        keluarBtn.setBackground(new java.awt.Color(255, 0, 0));
        keluarBtn.setText("Keluar");
        keluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(keluarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(460, 382));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bulanComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulanComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulanComboActionPerformed

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        // TODO add your handling code here:
       tahunTeks.setText("");
       bulanCombo.setSelectedItem("Januari");
       hasilLabel.setText("Jumlah Hari Pada Bulan _____ Tahun _____ Adalah _____");
       tahunTeks.requestFocus();
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void hitungBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungBtnActionPerformed
        // TODO add your handling code here:
         if (tahunTeks.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Harap Periksa Isian Anda !",
           "Eror: Isian Tahun Kosong!", JOptionPane.WARNING_MESSAGE);
       }else
       {
           int  Tahun = Integer.parseInt(tahunTeks.getText());
           int JumlahHari;
           if (bulanCombo.getSelectedItem().equals("Februari")){
               if(((Tahun % 4 == 0) &&! (Tahun % 100 == 0))|| (Tahun % 400 == 0))
                  JumlahHari = 29;
               else JumlahHari = 28;
           }else if(bulanCombo.getSelectedItem().equals("April")||
                 bulanCombo.getSelectedItem().equals("Juni")||
                 bulanCombo.getSelectedItem().equals("September")||
                 bulanCombo.getSelectedItem().equals("November")){
                 JumlahHari=30;
            }else{
                 JumlahHari=31;
            }
            hasilLabel.setText("Jumlah Hari Pada Bulan "+
                bulanCombo.getSelectedItem()+
                 " Tahun "+Tahun+" Adalah "+JumlahHari);
            hapusBtn.setEnabled(true);
            simpanBtn.setEnabled(true);
       }
    }//GEN-LAST:event_hitungBtnActionPerformed

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        // TODO add your handling code here:
            try{
            try (BufferedWriter out = new BufferedWriter(new FileWriter("jumlah hari.txt"))) {
                out.write(hasilLabel.getText());
                JOptionPane.showMessageDialog(null,"Berhasil disimpan dalam file");
            }
        }catch(IOException | HeadlessException e){
            System.err.println("Error :"+e.getMessage());
        }
    }//GEN-LAST:event_simpanBtnActionPerformed

    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarBtnActionPerformed
        // TODO add your handling code here:
        String Konfirmasi = "Apakah Anda Ingin Keluar?";
        boolean Iya = JOptionPane.showConfirmDialog(rootPane, Konfirmasi)
                == JOptionPane.YES_OPTION;
        if (Iya){
        System.exit(0);
        }
    }//GEN-LAST:event_keluarBtnActionPerformed

    private void tahunTeksKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tahunTeksKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
         if (!((Character.isDigit(c)||(c== KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE)||
                 (c == KeyEvent.VK_ENTER)))){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Masukan Angka!");
            evt.consume();
         }
    }//GEN-LAST:event_tahunTeksKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(AppDaysCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppDaysCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppDaysCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppDaysCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppDaysCalculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bulanCombo;
    private javax.swing.JLabel bulanLabel;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JLabel hasilLabel;
    private javax.swing.JButton hitungBtn;
    private javax.swing.JLabel hitungLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JButton simpanBtn;
    private javax.swing.JLabel tahunLabel;
    private javax.swing.JTextField tahunTeks;
    // End of variables declaration//GEN-END:variables
}
