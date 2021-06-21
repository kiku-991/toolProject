/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 */
public class FileMethod {

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
     * @return
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

    /**
     * テーブルデータをCSVに出力
     *
     * @param path
     * @param table
     */
    public boolean toCsv(String path, JTable table) {

        boolean flg = false;
        try {
            File file = new File(path + "\\data.txt");
            TableModel modelo = table.getModel();
            // FileWriter csv = new FileWriter(archivo);
            PrintWriter csv = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8")));

            for (int i = 0; i < modelo.getColumnCount(); i++) {
                if (i == modelo.getColumnCount() - 1) {
                    csv.write(modelo.getColumnName(i));
                } else {

                    csv.write(modelo.getColumnName(i) + ",");
                }
            }
            csv.write("\n");
            for (int i = 0; i < modelo.getRowCount(); i++) {
                for (int j = 0; j < modelo.getColumnCount(); j++) {
                    String data = (String) modelo.getValueAt(i, j);
                    if (data == "null") {
                        data = "";
                    }
                    if (j == modelo.getColumnCount() - 1) {
                        csv.write(data);
                    } else {
                        csv.write(data + ",");
                    }
                }
                csv.write("\n");
            }

            csv.close();
            flg = true;
        } catch (IOException ex) {
            Logger.getLogger(FileMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flg;
    }

}
