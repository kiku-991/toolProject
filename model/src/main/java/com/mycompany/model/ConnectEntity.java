/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConnectEntity {

    // ユーザ名
    public static String USERNAME;
    //パスワード
    public static String PASSWORD;
    //データベース名
    public static String DATABASENAME;
    //データベース別名
    public static String DATABASEBETUNAME;
    //データベース別名List
    public static List<String> DATABASEBETUNAMELIST;
    //異なるデータベース保存用
    public static Map<String, String> DIFFERENTDB;

}
