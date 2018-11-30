/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author J I N G G A
 */

import java.text.SimpleDateFormat ;
import java.util.* ;
import javax.swing.JOptionPane ;
import javax.swing.table.DefaultTableModel ;
import com.taufik.kuis2.* ;
import com.taufik.kuis2.Item;
import com.taufik.kuis2.Transaksi;

public class Tabel extends javax.swing.JFrame {
    
    // variabel ID untuk kode transaksi
    private int id = 0 ;
    // kode variabel untuk kode transaksi
    private String code ;
    // Jtable model
    private DefaultTableModel tbModel ;
    // Jcombobox Model
    // variable pembelanjaan untuk menampilkan transaksi item
    private ArrayList<Item> belanja = new ArrayList<>() ;
    
    
    public Tabel(){
        ItemTable tableModel = new ItemTable();
        this.tbModel = new DefaultTableModel (ItemTable.getKolom, 0)  ; // table kolom nama
        
        initComponents();
    }
    
//    // penambahan id    
    private void  incId(){
        this.id =+1 ;
    }
    
    
    // pengurangan id    
    private void decId(){
        this.id =- 1;
    }
    

    //set fungsi code
    
    private String setKode(){
        this.incId();
        String sk = new SimpleDateFormat("yyMMdd").format(new Date());
        this.code = String.format(sk + "%02d", this.id);
        return code;
    }
    
    // update fungsi jumlah
    private void  updateJumlah(String nama, int add){
        ArrayList<String> item = new ArrayList<>();
        for(int i = 0; i < tbModel.getRowCount(); i++){
            item.add(tbModel.getValueAt(i, 0).toString());
        }
        
        for(int i = 0; i < item.size(); i++){
            int jumlah = new Integer (tbModel.getValueAt(i, 2).toString());
            tbModel.setValueAt(jumlah+add, i, 2);
        }
    }
    
    // ngecek jika ada item double yang terpilih pada item sebelumnya
    
    private boolean isiDuplicate(String nama){
        boolean result = false;
        ArrayList<String>item = new ArrayList<>();
        
        for(int i = 0; i < tbModel.getRowCount(); i++){
            item.add(tbModel.getValueAt(i, 0).toString());
        }
        
        for(String i : item){
            if(i.equals(nama)){
                result = true;
            }
        }
        
        return result;
    }
    
    
    // ngecek jika isi tabel kosong
    
    private boolean isEmpty(){
        return this.tblistitems.getModel().getRowCount()<=0;
    }
    
    
    // mendisable tombol remove dan save jika isi tabel kosong
    
    private void belanja(){
        if(isEmpty()){
            this.btnsave.setEnabled(false);
            this.btnremove.setEnabled(false);
        }else{
            this.btnsave.setEnabled(true);
            this.btnsave.setEnabled(true);
        }
    }
    
    
    // dapat melakukan transaksi baru jika sudah menyelesaikan transaksi sebelumnya
//    private void newTransaksi () {
//        this.jmlitem.setText(" ") ;
//        this.textcode.setText(" ") ;
//        this.btnnew.setEnabled(true) ;
//        this.btnsave.setEnabled(false) ;
//        this.btncancel.setEnabled(false) ;
//        this.btnadd.setEnabled(false) ;
//        this.btnremove.setEnabled(false) ;
//        this.btnremove.setEnabled(false) ;
//        this.jmlitem.setEnabled(false) ;
//        this.itemcombo.setEnabled(false) ;
//        this.tbModel.setRowCount(0) ;
//        this.belanja.clear() ;
//    }
    private void newTransaksi(){
        this.jmlitem.setText(" ");
        this.textcode.setText(" ");
        this.btnnew.setEnabled(true);
        this.btnsave.setEnabled(false);
        this.btncancel.setEnabled(false);
        this.btnadd.setEnabled(false);
        this.btnremove.setEnabled(false);
        this.btnremove.setEnabled(false);
        this.jmlitem.setEnabled(false);
        this.itemcombo.setEnabled(false);
        this.tbModel.setRowCount(0);
        this.belanja.clear();
    }

    
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textcode = new javax.swing.JTextField();
        itemcombo = new javax.swing.JComboBox<>();
        jmlitem = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistitems = new javax.swing.JTable();
        btnremove = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Code");

        jLabel2.setText("Items");

        textcode.setEnabled(false);

        itemcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gula", "Kopi", "Susu" }));
        itemcombo.setSelectedIndex(-1);
        itemcombo.setEnabled(false);

        jmlitem.setEnabled(false);

        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnadd.setText("Add");
        btnadd.setEnabled(false);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        tblistitems.setModel(this.tbModel);
        jScrollPane1.setViewportView(tblistitems);

        btnremove.setText("Remove");
        btnremove.setEnabled(false);
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.setEnabled(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btncancel.setText("Cancel");
        btncancel.setEnabled(false);
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncancel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnremove))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textcode, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(itemcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jmlitem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnew))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmlitem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnremove))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btncancel))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            // loop setiap tabel
            for (int i = 0; i < tbModel.getRowCount(); i++) {
                // menyimpan nama dan jumlah menjadi variable
                String nama = tbModel.getValueAt (i , 0).toString () ;
                float harga = new Float (tbModel.getValueAt (0 , 1).toString()) ;
                int jumlah = new Integer (tbModel.getValueAt (i , 2).toString()) ;
                this.belanja.add (new Item(nama, jumlah , harga)) ;   
            }
            // instansiasi kelas Transaksi dengan kode dan committed belanja
            Transaksi tsk = new Transaksi (this.code , this.belanja) ;
            // Stringbuilder untuk menangani output Transaksi
            StringBuilder sbr = new StringBuilder() ;
            // menambahkan hasil transaksi
            sbr.append(tsk.Bayar()) ;
            // memanggil dialog dengan StringBuilder
            JOptionPane.showMessageDialog(this , sbr , "Transaksi" , JOptionPane.INFORMATION_MESSAGE) ;
            // melakukan transaksi baru
            newTransaksi () ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }//GEN-LAST:event_btnsaveActionPerformed

    
    
    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        this.jmlitem.setText ("1") ;
        this.btnnew.setEnabled (false) ;
        this.btncancel.setEnabled (true) ;
        this.btnadd.setEnabled (true) ;
        this.jmlitem.setEnabled (true) ;
        this.itemcombo.setEnabled (true) ;
        this.textcode.setText (this.setKode()) ;
    }//GEN-LAST:event_btnnewActionPerformed

    
    
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String nama = this.itemcombo.getSelectedItem().toString();
        float harga = new Float (this.jmlitem.getText()) ;
        int jumlah  = new Integer(this.jmlitem.getText());
        Item item = new Item(nama , jumlah , harga);
        if(isiDuplicate(nama)) {
            updateJumlah(nama , jumlah);
        } else {
            Object[] obj = {
                item.getNama(),
                item.getHarga(),
                item.getJumlah()
            } ;
            tbModel.addRow(obj);
        }
        this.belanja() ;
    }//GEN-LAST:event_btnaddActionPerformed

    
    
    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        newTransaksi() ;
        this.decId() ;
    }//GEN-LAST:event_btncancelActionPerformed

    
    
    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        // ngecek apakah ada baris yang dipilih
        if (tblistitems.getSelectedRow() <0) {
            // jika tidak ada , maka akan muncul tulisan seperti ini
            String sbr = "Pilihlah item yang akan dihapus" ;
            JOptionPane.showMessageDialog(this , sbr , "Information" , JOptionPane.INFORMATION_MESSAGE) ;  
        } else {
            // jika ada baris yg dipilih , maka baris tersebut akan dihapus
            int count = tblistitems.getSelectedRows().length ;
            for (int i = 0; i < count; i++) {
                tbModel.removeRow(tblistitems.getSelectedRow()) ;
            }
            
        }
        this.belanja() ;
    }//GEN-LAST:event_btnremoveActionPerformed

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
            java.util.logging.Logger.getLogger(Tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> itemcombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jmlitem;
    private javax.swing.JTable tblistitems;
    private javax.swing.JTextField textcode;
    // End of variables declaration//GEN-END:variables
}
