/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view.utils;

import com.mycompany.view.NewJDialog;

/**
 *
 */
public class DialogMessage {

    public void popDialog(String message) {

        NewJDialog dilog = new NewJDialog();
        NewJDialog.message.setText(message);
        dilog.setVisible(true);

    }

}
