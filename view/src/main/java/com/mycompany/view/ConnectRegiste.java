/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.model.DataBaseInfo;
import com.mycompany.util.ConmentMessage;
import com.mycompany.util.JDBCConnect;
import com.mycompany.view.utils.DialogMessage;
import java.sql.Statement;
import javax.swing.DefaultListModel;

/**
 *
 */
public class ConnectRegiste extends javax.swing.JFrame {

    //ダイアログ
    DialogMessage dialog = new DialogMessage();

    /**
     * Creates new form NewJFrame1
     */
    public ConnectRegiste() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PostgreSQL = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        serverName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PostCode = new javax.swing.JTextField();
        DatebaseName = new javax.swing.JTextField();
        UserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        Ok = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("データベースの内容を登録");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("データタイプ"));

        PostgreSQL.setBackground(new java.awt.Color(255, 255, 255));
        PostgreSQL.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        PostgreSQL.setSelected(true);
        PostgreSQL.setText("PostgreSQL");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        jRadioButton2.setText("Amazon Redshift");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(PostgreSQL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(169, 169, 169)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PostgreSQL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        jLabel1.setText("データベース名");

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        jLabel2.setText("サーバ名");

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        jLabel3.setText("ユーザ名");

        serverName.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        serverName.setText("localhost");

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        jLabel4.setText("ポート番号");

        PostCode.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        PostCode.setText("5432");

        DatebaseName.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N

        UserName.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        UserName.setText("postgres");

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        jLabel5.setText("パスワード");

        Password.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("パスワード保存");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(720, 720, 720))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addGap(45, 45, 45))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(41, 41, 41)))
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serverName)
                                    .addComponent(DatebaseName)
                                    .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                    .addComponent(Password))))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(PostCode))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(serverName, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(DatebaseName, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("基本", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("SSL", jPanel2);

        Ok.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        Ok.setIcon(new javax.swing.ImageIcon("D:\\netbeansWorkspace\\toolProject\\view\\src\\main\\java\\icon\\Knob-Valid-Green-icon.png")); // NOI18N
        Ok.setText("OK");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        Cancel.setIcon(new javax.swing.ImageIcon("D:\\netbeansWorkspace\\toolProject\\view\\src\\main\\java\\icon\\close_32.png")); // NOI18N
        Cancel.setText("キャンセル");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(589, 589, 589)
                        .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jTabbedPane1)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTabbedPane1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * okボタンを押下
     *
     * @param evt
     */
    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed

        //データベース名設定
        //  ConnectEntity.DATABASENAME = datebaseName.getText();
        String databaseName = DatebaseName.getText();
        //ユーザ名設定
        //  ConnectEntity.USERNAME = userName.getText();
        String username = UserName.getText();
        //パスワード設定
        //  ConnectEntity.PASSWORD = password.getText();
        String pwd = Password.getText();

        Statement st = JDBCConnect.connect.getConn(databaseName, username, pwd);
        AddOrDeleteDb db = new AddOrDeleteDb();

        //  ArrayList<String> dbList = new ArrayList<>();
        DefaultListModel demoList = new DefaultListModel();
        if (st != null) {
            //接続成功場合
//            dialog.popDialog(ConmentMessage.CONNECT_SUCCESSFUL, true);

            DataBaseInfo.connect.databaseAliasList.forEach((list) -> {
                demoList.addElement(list);
            });
            //データベース別名設定
            db.DataBaseList.setModel(demoList);
            db.setVisible(true);
        } else {
            //接続失敗場合
            dialog.popDialog(ConmentMessage.CONNECT_FAIL, false);
        }

        // ArrayList<String> tableList = jb.getAllTableName();
//        if (JDBCConnect.connect.getStmt() != null) {
//
//            //データベース別名を取得
//            System.out.println(DataBaseInfo.connect.getDatabaseName());
//
////            db.setVisible(true);
////            this.dispose();
//        } else {
//            //接続提示
//            dialog.popDialog(ConmentMessage.PLESECONNECT, false);
//
//        }
    }//GEN-LAST:event_OkActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        this.dispose();
        AddOrDeleteDb dbtp = new AddOrDeleteDb();
        dbtp.setVisible(true);
    }//GEN-LAST:event_CancelActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConnectRegiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectRegiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectRegiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectRegiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectRegiste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    public javax.swing.JTextField DatebaseName;
    private javax.swing.JButton Ok;
    public javax.swing.JTextField Password;
    private javax.swing.JTextField PostCode;
    private javax.swing.JRadioButton PostgreSQL;
    public javax.swing.JTextField UserName;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField serverName;
    // End of variables declaration//GEN-END:variables
}
