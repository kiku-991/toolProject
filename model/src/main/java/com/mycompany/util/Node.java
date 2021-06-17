/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import java.util.List;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

/**
 *
 */
public class Node {

    public static void main(String args[]) {

    }

    /**
     *
     * 初期値
     *
     * @param databaseName
     * @return
     */
    public static DefaultMutableTreeNode insertNode(String databaseName) {

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("データベース");
        DefaultMutableTreeNode mercury = new DefaultMutableTreeNode("localhost");
        root.add(mercury);
        DefaultMutableTreeNode venus = new DefaultMutableTreeNode(databaseName);
        mercury.add(venus);

        return root;
    }

    /**
     * 初期表示
     *
     * @param dbname
     * @return
     */
    public static DefaultTreeModel Model(String dbname) {
        DefaultMutableTreeNode root = insertNode(dbname);
        JTree tree = new JTree(root);
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        return model;

    }

    /**
     * 接続したら、テーブル名表示される
     *
     * @param databaseName
     * @param tableName
     * @return
     */
    public static DefaultMutableTreeNode insertNode(String databaseName, List<String> tableName) {

        DefaultMutableTreeNode root = insertNode(databaseName);

        for (String tbn : tableName) {
            DefaultMutableTreeNode table = new DefaultMutableTreeNode(tbn);
            root.add(table);
        }
        return root;

    }

    /**
     * 接続したら、表示
     *
     * @param dbname
     * @param tableName
     * @return
     */
    public static DefaultTreeModel Model(String dbname, List<String> tableName) {
//        DefaultMutableTreeNode root = insertNode(dbname);
        DefaultMutableTreeNode add = insertNode(dbname, tableName);
        JTree tree = new JTree(add);
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        return model;

    }

    public static MutableTreeNode children(List<String> tableName) {

        DefaultMutableTreeNode tables = new DefaultMutableTreeNode("public");
        for (String tbn : tableName) {
            DefaultMutableTreeNode table = new DefaultMutableTreeNode(tbn);
            tables.add(table);
        }

        return tables;

    }

}
