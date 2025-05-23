/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi_pembelian_skincarev2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Menu_skincare extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    /**
     * Creates new form menu_masakan
     */
    public Menu_skincare() {
        initComponents();
        k.connect();
        refreshTable();
    }
    
    class skincare extends Menu_skincare {
        int id_skincare, harga;
        String nama_skincare, status;
        
        public skincare() {
            this.nama_skincare = text_nama_skincare.getText();
            this.harga = Integer.parseInt(text_harga.getText());
            this.status = combo_stok_skincare.getSelectedItem().toString();
        }
                
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("ID Skincare");
        model.addColumn("Nama Skincare");
        model.addColumn("Harga");
        model.addColumn("Stok Skincare");
        table_skincare.setModel(model);
        try {
            this.stat = k.getCon().prepareStatement("select * from skincare");
            this.rs = this.stat.executeQuery();
            while (rs.next()) {                
                Object[] data ={
                    rs.getInt("id_skincare"),
                    rs.getString("nama_skincare"),
                    rs.getInt("harga"),
                    rs.getString("status")
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        text_id_skincare.setText("");
        text_nama_skincare.setText("");
        text_harga.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_id_skincare = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_nama_skincare = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combo_stok_skincare = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_skincare = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_input = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_menu_registrasi = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_menu_transaksi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU SKINCARE");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setText("ID Skincare");

        text_id_skincare.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        text_id_skincare.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setText("Nama Skincare");

        text_nama_skincare.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel4.setText("Harga");

        text_harga.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setText("Stok Skincare");

        combo_stok_skincare.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        combo_stok_skincare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1  ", "2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9  ", "10  ", "11  ", "12  ", "13  ", "14  ", "15  ", "16  ", "17  ", "18  ", "19  ", "20  ", "21  ", "22  ", "23  ", "24  ", "25  ", "26  ", "27  ", "28  ", "29  ", "30  ", "31  ", "32  ", "33  ", "34  ", "35  ", "36  ", "37  ", "38  ", "39  ", "40  ", "41  ", "42  ", "43  ", "44  ", "45  ", "46  ", "47  ", "48  ", "49  ", "50  ", "51  ", "52  ", "53  ", "54  ", "55  ", "56  ", "57  ", "58  ", "59  ", "60" }));
        combo_stok_skincare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_stok_skincareActionPerformed(evt);
            }
        });

        table_skincare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_skincare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_skincareMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_skincare);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_input.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn_input.setText("INPUT");
        btn_input.setEnabled(false);
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.setEnabled(false);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.setEnabled(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_menu_registrasi.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn_menu_registrasi.setText("MENU REGISTRASI");
        btn_menu_registrasi.setEnabled(false);
        btn_menu_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_registrasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_input, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_menu_registrasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_input, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_menu_registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btn_logout.setText("LOGOUT");
        btn_logout.setEnabled(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_menu_transaksi.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btn_menu_transaksi.setText("MENU TRANSAKSI");
        btn_menu_transaksi.setEnabled(false);
        btn_menu_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_transaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_menu_transaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_logout)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(text_harga)
                                    .addComponent(text_nama_skincare)
                                    .addComponent(text_id_skincare)
                                    .addComponent(combo_stok_skincare, 0, 452, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_logout)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_menu_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_id_skincare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_nama_skincare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_stok_skincare, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_stok_skincareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_stok_skincareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_stok_skincareActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try {
            skincare s = new skincare();
            this.stat = k.getCon().prepareStatement("update skincare set nama_skincare=?,"
                    + "harga=?,status=? where id_skincare=?");
            stat.setString(1, s.nama_skincare);
            stat.setInt(2, s.harga);
            stat.setString(3, s.status);
            stat.setInt(4, Integer.parseInt(text_id_skincare.getText()));
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_menu_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_transaksiActionPerformed
        // TODO add your handling code here:
        Menu_transaksi tran = new Menu_transaksi();
        tran.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menu_transaksiActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        try {
            skincare s = new skincare();
            this.stat = k.getCon().prepareStatement("insert into skincare values(?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, s.nama_skincare);
            stat.setInt(3, s.harga);
            stat.setString(4, s.status);
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_inputActionPerformed

    private void table_skincareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_skincareMouseClicked
        // TODO add your handling code here:
        text_id_skincare.setText(model.getValueAt(table_skincare.getSelectedRow(), 0).toString());
        text_nama_skincare.setText(model.getValueAt(table_skincare.getSelectedRow(), 1).toString());
        text_harga.setText(model.getValueAt(table_skincare.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_table_skincareMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try {
            skincare s = new skincare();
            this.stat = k.getCon().prepareStatement("delete from skincare where id_skincare=?");
            stat.setInt(1, Integer.parseInt(text_id_skincare.getText()));
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_menu_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_registrasiActionPerformed
        // TODO add your handling code here:
        Menu_registrasi reg = new Menu_registrasi();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menu_registrasiActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_skincare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_skincare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_skincare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_skincare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_skincare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_delete;
    public javax.swing.JButton btn_input;
    public javax.swing.JButton btn_logout;
    public javax.swing.JButton btn_menu_registrasi;
    public javax.swing.JButton btn_menu_transaksi;
    public javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> combo_stok_skincare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_skincare;
    private javax.swing.JTextField text_harga;
    private javax.swing.JTextField text_id_skincare;
    private javax.swing.JTextField text_nama_skincare;
    // End of variables declaration//GEN-END:variables
}
