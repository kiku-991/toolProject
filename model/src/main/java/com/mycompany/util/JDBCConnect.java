/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import com.mycompany.model.DataBaseInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Getter;
import lombok.Setter;

/**
 *
 *
 */
@Getter
@Setter
public class JDBCConnect {

    public static final JDBCConnect connect = new JDBCConnect();

    Connection conn;
    Statement stmt;
    ResultSet rset;

    List<String> dataNameList = new ArrayList<>();

    /**
     * データベース接続
     *
     * @param databaseName
     * @param userName
     * @param pwd
     * @return stmt
     */
    public Statement getConn(String databaseName, String userName, String pwd) {

        //DataBaseInfo database = new DataBaseInfo();
        //ドライバー
        String driver = ConmentMessage.DRIVER;
        //データベース名
        DataBaseInfo.connect.setDatabaseName(databaseName);
        //ユーザ名
        DataBaseInfo.connect.setUserName(userName);
        //パスワード
        DataBaseInfo.connect.setPassword(pwd);
        //データベース別名
        String databaseAlias = ConmentMessage.LOCALHOST + databaseName;
        DataBaseInfo.connect.setDatabaseAlias(databaseAlias);

        //データベース別名List
        dataNameList.add(databaseAlias);
        DataBaseInfo.connect.setDatabaseAliasList(dataNameList);
        //dbInfo.add(database);

        String jdbcUrl = ConmentMessage.JDBCURL + databaseName;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(jdbcUrl, userName, pwd);
            stmt = conn.createStatement();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return stmt;

    }

    /**
     * クローズデータベース
     *
     * @throws SQLException
     */
    public void closeDBcon() throws SQLException {
        if (conn != null) {
            stmt.close();
            conn.close();
        }
    }

    /**
     * 実行SQL
     *
     * @param databaseName
     * @param userName
     * @param pwd
     * @param sql
     * @return
     */
    public ResultSet executeSql(String databaseName, String userName, String pwd, String sql) {

        try {
            rset = getConn(databaseName, userName, pwd).executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rset;
    }

    /**
     * ログイン
     *
     * @param databaseName
     * @param username
     * @param pwd
     * @return
     */
    public Statement getDBConn(String databaseName, String username, String pwd) {
        //ドライバー
        String driver = ConmentMessage.DRIVER;
        // String url = "jdbc:postgresql://" + sname + ":" + portNum + "/" + dbname;
        String jdbcUrl = ConmentMessage.JDBCURL + databaseName;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(jdbcUrl, username, pwd);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return stmt;

    }

    /**
     * すべてのテーブル名を取得
     *
     * @param databaseName
     * @param username
     * @param pwd
     * @return tableList
     */
    public ArrayList<String> getAllTableList(String databaseName, String username, String pwd) {

        ArrayList<String> tableList = new ArrayList<>();
        //すべてのテーブルを取得sql
        String sql = "select\r\n"
                + "    tablename \r\n"
                + "from\r\n"
                + "    pg_tables \r\n"
                + "where\r\n"
                + "    schemaname = 'public'";
        try {
            //PostgreSQLへ接続
            getDBConn(databaseName, username, pwd);
            rset = stmt.executeQuery(sql);
            //SELECT結果の受け取り
            while (rset.next()) {
                String col = rset.getString(1);
                tableList.add(col);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tableList;

    }

}
