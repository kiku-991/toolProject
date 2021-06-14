/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view.utils;

import com.mycompany.util.ConmentMessage;
import com.mycompany.view.NewJDialog;
import com.mycompany.view.DatabaseLogin;
import javax.swing.ImageIcon;

/**
 *
 */
public class DialogMessage {

    /**
     * メッセージが表示され
     *
     * @param message
     */
    public void popDialog(String message, boolean flg) {

        ImageIcon oKIcon = new ImageIcon(ConmentMessage.INFOICON);
        ImageIcon attentionIcon = new ImageIcon(ConmentMessage.ATTETIONICON);

        NewJDialog dilog = new NewJDialog();
        if (flg == false) {
            //setIcon
            NewJDialog.message.setIcon(attentionIcon);
        } else {
            //setIcon
            NewJDialog.message.setIcon(oKIcon);
        }
        NewJDialog.message.setText(message);

        dilog.setVisible(true);

    }

    /**
     * DBログイン
     * @param pswd 
     */
    public void popLocalDBLogin(String title,String pswd) {
        DatabaseLogin login = new DatabaseLogin();
        login.setTitle(title);
        login.uname.setText("postgres");
        login.pwd.setText(pswd);
        login.setVisible(true);
    }

}
