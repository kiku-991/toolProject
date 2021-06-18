/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import com.mycompany.model.DataBaseInfo;
import com.mycompany.model.TableInfo;
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
    List<TableInfo> tableInfoList = new ArrayList<>();

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
     * @param tableName
     * @return
     */
    public List<TableInfo> SqlRun(String databaseName, String userName, String pwd, String tableName) {

        try {
            String coulmnSql = "SELECT\n"
                    + "    a.attname as name\n"
                    + "    , format_type(a.atttypid, a.atttypmod) as type\n"
                    + "FROM\n"
                    + "    pg_class as c\n"
                    + "    , pg_attribute as a \n"
                    + "where\n"
                    + "    c.relname = " + "'" + tableName + "'" + "\n"
                    + "    and a.attrelid = c.oid \n"
                    + "    and a.attnum > 0";
            rset = getConn(databaseName, userName, pwd).executeQuery(coulmnSql);
            //SELECT結果の受け取り

            while (rset.next()) {
                TableInfo tableInfo = new TableInfo();
                //获取数据类型
                String name = rset.getString(1);
                tableInfo.setColumnName(name);
                //获取字段名称
                Object type = rset.getString(2);
                String dtype = TemplateReader.classCast(type);
                tableInfo.setDataType(dtype);
                tableInfoList.add(tableInfo);

            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tableInfoList;

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

    /**
     * tableColumn数量を取得
     *
     * @param databaseName
     * @param userName
     * @param pwd
     * @param tableName
     * @return
     */
    public int getTableColumn(String databaseName, String userName, String pwd, String tableName) {

        int count = 0;
        try {
            String sql = "select\n"
                    + "    count(*) \n"
                    + "from\n"
                    + "    information_schema.COLUMNS \n"
                    + "where\n"
                    + "    table_name = '" + tableName + "'";
            rset = getConn(databaseName, userName, pwd).executeQuery(sql);
            //SELECT結果の受け取り
            while (rset.next()) {
                count = rset.getInt("count");
                System.out.println(count);

            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
    }

}
