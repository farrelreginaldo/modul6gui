/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farrel
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
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

        jurusan = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        bsn = new javax.swing.JTextField();
        r = new javax.swing.JRadioButton();
        t = new javax.swing.JRadioButton();
        prog = new javax.swing.JCheckBox();
        tek = new javax.swing.JCheckBox();
        ani = new javax.swing.JCheckBox();
        des = new javax.swing.JCheckBox();
        sub = new javax.swing.JButton();
        hps = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasile = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setText("Biodata Siswa");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(199, 13, 80, 16);

        jLabel2.setText("Nama");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(12, 45, 33, 16);

        jLabel3.setText("Absen");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(12, 80, 35, 16);

        jLabel4.setText("Jurusan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(12, 112, 44, 16);

        jLabel5.setText("Hobi");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(12, 142, 25, 16);

        nm.setBackground(new java.awt.Color(204, 255, 255));
        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });
        jPanel1.add(nm);
        nm.setBounds(91, 42, 277, 22);

        bsn.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(bsn);
        bsn.setBounds(91, 77, 277, 22);

        r.setBackground(new java.awt.Color(204, 255, 255));
        jurusan.add(r);
        r.setText("RPL");
        jPanel1.add(r);
        r.setBounds(91, 108, 49, 25);

        t.setBackground(new java.awt.Color(204, 255, 255));
        jurusan.add(t);
        t.setText("TKJ");
        jPanel1.add(t);
        t.setBounds(272, 108, 49, 25);

        prog.setBackground(new java.awt.Color(204, 255, 255));
        prog.setText("Programming");
        jPanel1.add(prog);
        prog.setBounds(91, 138, 105, 25);

        tek.setBackground(new java.awt.Color(204, 255, 255));
        tek.setText("Teknisi");
        jPanel1.add(tek);
        tek.setBounds(272, 138, 69, 25);

        ani.setBackground(new java.awt.Color(204, 255, 255));
        ani.setText("Animator");
        jPanel1.add(ani);
        ani.setBounds(91, 163, 81, 25);

        des.setBackground(new java.awt.Color(204, 255, 255));
        des.setText("Designer");
        jPanel1.add(des);
        des.setBounds(272, 163, 79, 25);

        sub.setBackground(new java.awt.Color(204, 255, 255));
        sub.setText("Submit");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        jPanel1.add(sub);
        sub.setBounds(39, 215, 73, 25);

        hps.setBackground(new java.awt.Color(204, 255, 255));
        hps.setText("Delete");
        hps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpsActionPerformed(evt);
            }
        });
        jPanel1.add(hps);
        hps.setBounds(169, 215, 69, 25);

        keluar.setBackground(new java.awt.Color(204, 255, 255));
        keluar.setText("Exit");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel1.add(keluar);
        keluar.setBounds(296, 215, 53, 25);

        jLabel6.setText("Hasil");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(12, 258, 27, 16);

        hasile.setBackground(new java.awt.Color(204, 255, 255));
        hasile.setColumns(20);
        hasile.setRows(5);
        jScrollPane1.setViewportView(hasile);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(12, 287, 356, 150);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 408, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nmActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_keluarActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        String nama = nm.getText();
        String absen = bsn.getText();
        String jurusan;
        String hobi= "";
        
        if(r.isSelected()){
            jurusan = "RPL";}
        else if(t.isSelected()){
            jurusan = "TKJ";}
        else{
            jurusan =" ";}
        
        if(prog.isSelected())
            hobi+=prog.getText()+", ";
        if(ani.isSelected())
            hobi+=ani.getText()+", ";
        if(tek.isSelected())
            hobi+=tek.getText()+", ";
        if(des.isSelected())
            hobi+=des.getText()+", ";
        
        hasile.setText("nama : "+ nama+"\nAbsen : "+ bsn + "\nJurusan : "+ 
                jurusan+"\nHobi : "+ hobi);
    }//GEN-LAST:event_subActionPerformed

    private void hpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpsActionPerformed
hasile.setText("");
nm.setText("");
bsn.setText("");
jurusan.clearSelection();
des.setSelected(false);
ani.setSelected(false);
tek.setSelected(false);
prog.setSelected(false);
    }//GEN-LAST:event_hpsActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ani;
    private javax.swing.JTextField bsn;
    private javax.swing.JCheckBox des;
    private javax.swing.JTextArea hasile;
    private javax.swing.JButton hps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jurusan;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nm;
    private javax.swing.JCheckBox prog;
    private javax.swing.JRadioButton r;
    private javax.swing.JButton sub;
    private javax.swing.JRadioButton t;
    private javax.swing.JCheckBox tek;
    // End of variables declaration//GEN-END:variables
}
