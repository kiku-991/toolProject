/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view.utils;

import java.io.File;

/**
 *
 */
public class makeDirectoryTest {

    public static boolean mkDirectory(String path) {

        File file = new File(path);
        if (!file.exists()) {
            return file.mkdirs();
        } else {
            return false;
        }

    }

}
