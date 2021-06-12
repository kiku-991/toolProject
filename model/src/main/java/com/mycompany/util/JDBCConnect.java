/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import com.mycompany.model.ConnectEntity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    Connection conn;
    Statement stmt;
    ResultSet rset;


    public static final JDBCConnect connect = new JDBCConnect();

    /**
     * データベース接続
     *
     * @return
     */
    public Statement getConn() {

        //ドライバー
        String driver = "org.postgresql.Driver";
        // String url = "jdbc:postgresql://" + sname + ":" + portNum + "/" + dbname;

        //データベース名
        String databaseName = ConnectEntity.DATABASENAME;
        //ユーザ名
        String username = ConnectEntity.USERNAME;
        //パスワード
        String pwd = ConnectEntity.PASSWORD;

        ConnectEntity.DATABASEBETUNAME = "localhost/" + databaseName;

        /*
        "jdbc:postgresql://localhost:5432/kiku", "postgres", "postgres"
         */
        String jdbcUrl = "jdbc:postgresql://localhost:5432/" + databaseName;
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

    public void closeDBcon() throws SQLException {
        if (conn != null) {
            stmt.close();
            conn.close();
        }
    }

    public void executeSql(String sql) {

        try {
            getConn().executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<String> getAllTableName() {

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
            getConn();
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
