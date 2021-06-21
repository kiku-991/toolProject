/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataBaseInfo {

    public static final DataBaseInfo connect = new DataBaseInfo();

    // ユーザ名
    public String userName;
    //パスワード
    public String password;
    //データベース名
    public String databaseName;
    //データベース別名
    public String databaseAlias;

    public List<String> databaseAliasList;

    //状態
    public Integer status;

    public Connection connection;
    public Statement statement;
    public ResultSet result;

}
