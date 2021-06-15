/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 */
public class Node {

    public static void main(String args[]) {

    }

    public static DefaultMutableTreeNode insertNode(String name) {

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("データベース");
        DefaultMutableTreeNode mercury = new DefaultMutableTreeNode("localhost");
        root.add(mercury);

        DefaultMutableTreeNode venus = new DefaultMutableTreeNode(name);
        mercury.add(venus);
        DefaultMutableTreeNode mars = new DefaultMutableTreeNode("public");
        venus.add(mars);
        return root;

    }

    public static DefaultTreeModel Model(String name) {
        DefaultMutableTreeNode xx = insertNode(name);
        JTree tree = new JTree(xx);
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        return model;

    }

}
