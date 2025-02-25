/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import config.crud;
import config.dynamicAll;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class nota extends javax.swing.JFrame {
String judulKolom[]={"ID","Nama Barang","Harga Barang","Jumlah Barang","Diskon","Total"};
int lebarKolom[]={250,200,210,200,200,200};
String sql="SELECT * FROM nota";

private final crud cruddb;
private dynamicAll formHandler;

    private void initializeFormFields() {
        formHandler = new dynamicAll();
        formHandler.addField("id", txtID);
        formHandler.addField("nama_barang", txtNmBarang);
        formHandler.addField("harga_barang",txtHargaBarang);
        formHandler.addField("jumlah_barang",txtJMLBarang);
        formHandler.addField("diskon", txtDisc);
        formHandler.addField("total", txtTot);
        
    }
        private void loaddata(){
        cruddb.settingJudulTabel(jTable1, judulKolom);
        cruddb.settingLebarKolom(jTable1, lebarKolom);
        cruddb.tampilTabel(jTable1, sql, judulKolom);
    } 
        
    // Method untuk memformat number ke string dengan pemisah ribuan menggunakan titik
    private String formatNumber(double number) {
    DecimalFormat formatter = new DecimalFormat("#,###");
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
    symbols.setGroupingSeparator('.');
    formatter.setDecimalFormatSymbols(symbols);
    return formatter.format(number);
}

    // Method untuk mengkonversi string berformat ke number
    private double parseFormattedNumber(String number) {
    try {
        // Menghilangkan semua pemisah ribuan (titik)
        String cleanNumber = number.replace(".", "");
        // Konversi ke double
        return Double.parseDouble(cleanNumber);
    } catch (NumberFormatException e) {
        return 0.0;
    }
}
    /**
     * Creates new form nota
     */
    public nota() {
        initComponents();
        
        this.setLocationRelativeTo(null); // meletakan posisi form berada ditengah windows
        cruddb = new crud();
        
        // Inisialisasi form handler
        initializeFormFields();
        
        loaddata();
        
        // Add calculation listeners
        addCalculationListeners();
        addFormattingListeners();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNmBarang = new javax.swing.JTextField();
        txtHargaBarang = new javax.swing.JTextField();
        txtJMLBarang = new javax.swing.JTextField();
        txtTot = new javax.swing.JTextField();
        txtDisc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Form Input Nota");

        jLabel2.setText("ID");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Harga Barang");

        jLabel5.setText("Jumlah Barang");

        jLabel6.setText("Diskon (2.5%)");

        jLabel7.setText("Total ");

        txtID.setToolTipText("");

        txtNmBarang.setToolTipText("");

        txtHargaBarang.setToolTipText("");

        txtJMLBarang.setToolTipText("");

        txtTot.setToolTipText("");
        txtTot.setDisabledTextColor(new java.awt.Color(255, 0, 0));

        txtDisc.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnSimpan.setBackground(new java.awt.Color(102, 255, 102));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(102, 204, 255));
        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 102, 102));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBersih.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBersih.setText("Bersih");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        btnCetak.setBackground(new java.awt.Color(255, 255, 102));
        btnCetak.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTot, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJMLBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNmBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBersih))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnCetak)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNmBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtJMLBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus)
                            .addComponent(btnBersih))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCetak))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void addCalculationListeners() {
    // Add listeners for harga barang
    txtHargaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            calculateTotal();
        }
    });
    
    // Add listeners for jumlah barang
    txtJMLBarang.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            calculateTotal();
        }
    });
    
    // Add listeners for diskon
    txtDisc.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            calculateTotal();
        }
    });
}

    private void calculateTotal() {
    try {
        String hargaStr = txtHargaBarang.getText().trim().replace(".", "");
        String jumlahStr = txtJMLBarang.getText().trim();
        String diskonStr = txtDisc.getText().trim();
        
        if (hargaStr.isEmpty()) {
            txtTot.setText("");
            return;
        }
        
        // Konversi harga
        double harga = Double.parseDouble(hargaStr);
        
        // Hitung total berdasarkan harga saja jika jumlah kosong
        if (jumlahStr.isEmpty()) {
            txtTot.setText(formatNumber(harga));
            return;
        }
        
        // Hitung total dengan jumlah
        double jumlah = Double.parseDouble(jumlahStr);
        double subtotal = harga * jumlah;
        
        // Terapkan diskon jika ada
        if (!diskonStr.isEmpty()) {
            double diskonPersen = Double.parseDouble(diskonStr);
            double diskonAmount = (subtotal * diskonPersen) / 100;
            subtotal -= diskonAmount;
        }
        
        // Format dan tampilkan total
        txtTot.setText(formatNumber(subtotal));
        
    } catch (NumberFormatException e) {
        // Pertahankan total saat ini jika terjadi error
    }
}

private void addFormattingListeners() {
    txtHargaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            try {
                String input = txtHargaBarang.getText().trim().replace(".", "");
                if (!input.isEmpty()) {
                    double value = Double.parseDouble(input);
                    txtHargaBarang.setText(formatNumber(value));
                }
            } catch (NumberFormatException e) {
                // Biarkan input yang tidak valid apa adanya
            }
        }
    });
}
    
    
    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
        // Validasi ID
        if (txtID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak ada data yang diubah!");
            return;
        }

        // Simpan nilai asli sebelum diformat
        String hargaOriginal = txtHargaBarang.getText().trim();
        String totalOriginal = txtTot.getText().trim();
        
        // Convert ke double untuk database
        double hargaDouble = parseFormattedNumber(hargaOriginal);
        double totalDouble = parseFormattedNumber(totalOriginal);
        
        // Temporarily set nilai untuk database
        txtHargaBarang.setText(String.valueOf(hargaDouble));
        txtTot.setText(String.valueOf(totalDouble));
        
        // Get field names and values for update
        String[] fields = formHandler.getFieldNames();
        String[] values = formHandler.getFieldValues();
        
        // Perform update
        cruddb.UbahDinamis("nota", "id", txtID.getText(), fields, values);
        
        // Kembalikan nilai display asli
        txtHargaBarang.setText(hargaOriginal);
        txtTot.setText(totalOriginal);
        
        // Reload data
        loaddata();
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Format angka tidak valid!");
    }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this,
            "Apakah anda yakin ingin menghapus data ini?",
            "Konfirmasi Hapus",
            JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            cruddb.HapusDinamis("nota", "id", txtID.getText());
            bersihForm();
            loaddata();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        try {
        // Simpan nilai asli sebelum diformat
        String hargaOriginal = txtHargaBarang.getText().trim();
        String totalOriginal = txtTot.getText().trim();
        
        // Convert ke double untuk database tanpa mengubah display
        double hargaDouble = parseFormattedNumber(hargaOriginal);
        double totalDouble = parseFormattedNumber(totalOriginal);
        
        // Temporarily set nilai double ke text field untuk simpan ke database
        String hargaTemp = txtHargaBarang.getText();
        String totalTemp = txtTot.getText();
        
        txtHargaBarang.setText(String.valueOf(hargaDouble));
        txtTot.setText(String.valueOf(totalDouble));
        
        String[] fields = formHandler.getFieldNames();
        String[] values = formHandler.getFieldValues();

        if (formHandler.hasEmptyFields()) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!");
            return;
        }

        if (cruddb.DuplicateKey("nota", "id", values[0])) {
            JOptionPane.showMessageDialog(this, "ID sudah ada!");
            return;
        }

        // Simpan ke database
        cruddb.simpanDinamis("nota", fields, values);
        loaddata();
        
        // Kembalikan nilai display asli
        txtHargaBarang.setText(hargaOriginal);
        txtTot.setText(totalOriginal);
                
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
    }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        bersihForm();
    }//GEN-LAST:event_btnBersihActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris=jTable1.getSelectedRow();

        txtID.setText(jTable1.getValueAt(baris, 0).toString());
        txtNmBarang.setText(jTable1.getValueAt(baris, 1).toString());
        txtHargaBarang.setText(jTable1.getValueAt(baris, 2).toString());
        txtJMLBarang.setText(jTable1.getValueAt(baris, 3).toString());
        txtDisc.setText(jTable1.getValueAt(baris, 4).toString());
        txtTot.setText(jTable1.getValueAt(baris, 5).toString());
        
        
        String id = jTable1.getValueAt(baris, 0).toString();
        String namaBarang = jTable1.getValueAt(baris, 1).toString();
        String hargaBarang = jTable1.getValueAt(baris, 2).toString();
        String jumlahBarang = jTable1.getValueAt(baris, 3).toString();
        String diskon = jTable1.getValueAt(baris, 4).toString();
        String total = jTable1.getValueAt(baris, 5).toString();

        
        // Mengisi field input dengan data yang diambil
        txtID.setText(id);
        txtNmBarang.setText(namaBarang);
        txtHargaBarang.setText(hargaBarang);
        txtJMLBarang.setText(jumlahBarang);
        txtDisc.setText(diskon);
        txtTot.setText(total);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
    try {
        cruddb.tampilLaporan("src/laporan/nota.jrxml", "select * from nota");
    } catch (SQLException ex) {
        Logger.getLogger(nota.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnCetakActionPerformed

    
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
            java.util.logging.Logger.getLogger(nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDisc;
    private javax.swing.JTextField txtHargaBarang;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJMLBarang;
    private javax.swing.JTextField txtNmBarang;
    private javax.swing.JTextField txtTot;
    // End of variables declaration//GEN-END:variables
    
    // Method Dinamis Bersih Inputan Form
    private void bersihForm() {
    // Iterasi melalui semua komponen di content pane
    for (java.awt.Component component : this.getContentPane().getComponents()) {
        // Memeriksa apakah komponen tersebut adalah JTextField
        if (component instanceof javax.swing.JTextField) {
            // Membersihkan setiap JTextField
            ((javax.swing.JTextField) component).setText("");
        }
    }
    // Fokuskan kembali ke field pertama setelah pembersihan
    txtID.requestFocus();
}

}
