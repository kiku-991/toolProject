/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 */
public class FileChoose {

    /**
     * ファイル選択
     *
     * @param com
     */
    public void selectedFile(Component com) {
        JFileChooser filechooser = new JFileChooser();

        int selected = filechooser.showOpenDialog(com);
        if (selected == JFileChooser.APPROVE_OPTION) {
            File file = filechooser.getSelectedFile();
            System.out.println(file.getPath());
        }
    }

    /**
     * フォルダ選択
     *
     * @param comp
     */
    public String getDirectory(Component comp) {

        String path = "";

        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));

        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //    
        if (chooser.showOpenDialog(comp) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): "
                    + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : "
                    + chooser.getSelectedFile());

            path = chooser.getSelectedFile().toString();
        } else {
            System.out.println("No Selection ");
           
        }

        return path;
    }

}
