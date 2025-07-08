
package restaurant;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat; 
import java.util.ArrayList;
import java.util.Date; 
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 


public class gui extends javax.swing.JFrame {
    
    private DefaultTableModel tableModel;
    private List<Restaurant> restaurantList;
    
    public gui() {
        initComponents();
        initializeTable(); 
        restaurantList = new ArrayList<>(); 
        jDateChooser1.setDateFormatString("MMMM yyyy");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        bruto = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        listair = new javax.swing.JTextField();
        bahan = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        sumbit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Data Restaurant");

        jLabel2.setText("Nama Restaurant");

        jLabel3.setText("Bulan");

        jLabel4.setText("Pendapatan Bruto");

        jLabel5.setText("Pengeluaran Listrik & Air");

        jLabel6.setText("Pengeluaran Bahan");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        reset.setText("Reset Data");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        sumbit.setText("Tambah Data");
        sumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Bulan", "Pendapatan Bruto", "Pengeluaran Listrik & Air", "Pengeluaran Bahan", "Pendapatan Net", "Manager", "Sewa", "Owner", "CSR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(reset))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nama)
                                    .addComponent(bruto)
                                    .addComponent(listair)
                                    .addComponent(bahan))
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(sumbit))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(807, 807, 807)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(bruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(listair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(bahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(sumbit))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void sumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitActionPerformed
         try {
            String namaRestaurant = nama.getText();

            // Mendapatkan tanggal dari JDateChooser
            Date selectedDate = jDateChooser1.getDate();
            if (selectedDate == null) {
                JOptionPane.showMessageDialog(this, "Tanggal/Bulan tidak boleh kosong.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Format tanggal menjadi String "MMMM yyyy"
            SimpleDateFormat monthYearFormat = new SimpleDateFormat("MMMM yyyy");
            String bulan = monthYearFormat.format(selectedDate);

            double pendapatanBruto = Double.parseDouble(bruto.getText());
            double pengeluaranListair = Double.parseDouble(listair.getText());
            double pengeluaranBahan = Double.parseDouble(bahan.getText());

            // Validasi input
            if (namaRestaurant.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama Restaurant tidak boleh kosong.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (pendapatanBruto < 0 || pengeluaranListair < 0 || pengeluaranBahan < 0) {
                JOptionPane.showMessageDialog(this, "Nilai pendapatan/pengeluaran tidak boleh negatif.", "Input Error", JOptionPane.INFORMATION_MESSAGE); // Ubah ke INFORMATION_MESSAGE
                return;
            }

            // Buat objek Restaurant
            // Sesuaikan konstruktor sesuai dengan definisi Anda di kelas Restaurant.java
            // Jika Anda sudah mengubah konstruktor menjadi 5 parameter (String, String, double, double, double):
            Restaurant restaurant = new Restaurant(namaRestaurant, bulan, pendapatanBruto, pengeluaranListair, pengeluaranBahan);
            
            // Jika konstruktor Anda masih memiliki 7 parameter (String, String, double, double, double, double, double)
            // Restaurant restaurant = new Restaurant(namaRestaurant, bulan, pendapatanBruto, pengeluaranListair, pengeluaranBahan, 0.0, 0.0);


            restaurantList.add(restaurant); // Tambahkan ke list
            populateTable(); // Perbarui tabel
            clearForm(); // Kosongkan form
            
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Harap masukkan angka yang valid untuk Pendapatan dan Pengeluaran.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // Cetak stack trace untuk debugging lebih lanjut
        }
    }//GEN-LAST:event_sumbitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        clearForm();
        JOptionPane.showMessageDialog(this, "Form telah direset.", "Reset", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_resetActionPerformed
    private void clearForm() {
        nama.setText("");
        jDateChooser1.setDate(null); // Mengosongkan JDateChooser
        bruto.setText("");
        listair.setText("");
        bahan.setText("");
    }
    
     private void populateTable() {
        tableModel.setRowCount(0); // Hapus semua baris yang ada

        for (Restaurant r : restaurantList) {
            Object[] rowData = {
                r.getNama(),
                r.getBulan(),
                r.getPendBruto(),
                r.getPengListAir(),
                r.getPengBahan(),
                r.getPendNet(),
                r.getManager(),
                r.getSewa(),
                r.getOwner(),
                r.getCsr()
            };
            tableModel.addRow(rowData);
        }
    }
     
     
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bahan;
    private javax.swing.JTextField bruto;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField listair;
    private javax.swing.JTextField nama;
    private javax.swing.JButton reset;
    private javax.swing.JButton sumbit;
    // End of variables declaration//GEN-END:variables

    private void initializeTable() {
        String[] columnNames = {"Nama", "Bulan", "Pend. Bruto", "Peng. Listrik & Air", "Peng. Bahan",
                                "Pend. Net", "Manager", "Sewa", "Owner", "CSR"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        jTable1.setModel(tableModel);
    }
}
