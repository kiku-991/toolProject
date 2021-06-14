/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class Output {

    JDBCConnect jdbc = new JDBCConnect();

    /**
     * テーブルのタイプとカラム名取得
     *
     * @param tableName
     * @param path
     * @return list
     */
    public boolean getColumnAndType(String tableName, String path) {

        boolean flg = false;
        Statement stmt = null;
        ResultSet rset = null;

        ArrayList<Map> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        try {

            stmt = jdbc.getConn();

            String coulmnSql = "SELECT\n"
                    + "    a.attname as name\n"
                    + "    , format_type(a.atttypid, a.atttypmod) as type\n"
                    + "    , col_description(a.attrelid, a.attnum) as comment \n"
                    + "FROM\n"
                    + "    pg_class as c\n"
                    + "    , pg_attribute as a \n"
                    + "where\n"
                    + "    c.relname = " + "'" + tableName + "'" + "\n"
                    + "    and a.attrelid = c.oid \n"
                    + "    and a.attnum > 0";

            rset = stmt.executeQuery(coulmnSql);

            String className = getClassName(tableName);
            StringBuffer sb = new StringBuffer();
            sb.append("package " + getPackageName(path) + ";\n");
            sb.append("import javax.persistence.Entity;" + "\n");
            sb.append("import javax.persistence.Table;\n");
            sb.append("import lombok.Data;\n\n");
            sb.append("@Entity\n");
            sb.append("@Data\n");
            sb.append("@Table(name = \"" + tableName + "\")\n");
            sb.append("public class " + className + "{\n"
            );

            //SELECT結果の受け取り
            while (rset.next()) {
                String name = rset.getString(1);
                // System.out.println("COLUMN_NAME:" + name);
                map.put("COLUMN_NAME", name);
                String type = rset.getString(2);
                //  System.out.println("DATA_TYPE:" + type);
                map.put("DATA_TYPE", type);
                String comment = rset.getString(3);
                //  System.out.println("COLUMN_COMMENT=" + comment);
                map.put("COLUMN_COMMENT", comment);
                //

                Object dataType = map.get("DATA_TYPE");//获取数据类型
                String dtype = classCast(dataType);//数据类型
                Object property = map.get("COLUMN_NAME");//获取字段名称
                String propertity = getPropertity(property);//属性名称
                Object annotation = map.get("COLUMN_COMMENT");//注解
                sb.append("\t//" + annotation + "\n");
                sb.append("\tprivate " + dtype + " " + propertity + ";" + "\n");

            }
            sb.append("}");
            list.add(map);
            try {
                //生成java文件
                getFile(className, sb.toString(), path);
                flg = true;
            } catch (IOException e) {
                e.printStackTrace();
                flg = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Output.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flg;

    }

    /**
     * 生成类名
     *
     * @param tableName 表名
     * @return
     */
    private String getClassName(String tableName) {
        String newClassName = "";
        int i = tableName.indexOf("_");
        if (i < 0) {
            //アンダーバーがない場合
            newClassName = tableName.substring(0, 1).toUpperCase() + tableName.substring(1);
        } else {
            //アンダーバーがある場合
            String[] strs = tableName.split("_");
            StringBuffer sb = new StringBuffer();
            for (int m = 0; m < strs.length; m++) {
                sb.append(strs[m].substring(0, 1).toUpperCase() + strs[m].substring(1));
            }
            newClassName = sb.toString();
        }
        return newClassName;
    }

    /**
     * 生成属性java类型
     *
     * @param obj
     * @return
     */
    private String classCast(Object obj) {
        String type = "";
        String str = (String) obj;
        if (str.equals("varchar") || str.equals("char") || str.equals("text")) {
            type = "String";
        } else if (str.equals("int") || str.equals("interger")) {
            type = "Integer";
        } else if (str.equals("bigint")) {
            type = "Long";
        } else if (str.equals("double") || str.equals("float")) {
            type = "Double";
        } else if (str.equals("date") || str.equals("datetime") || str.equals("timestamp") || str.equals("timestamp without time zone")) {
            type = "Date";
        } else {
            type = "String";
        }
        return type;
    }
    //数据库字段名字转java属性名字

    private String getPropertity(Object obj) {
        String pro = "";
        String colum = (String) obj;
        int index = colum.indexOf("_");
        //判断アンダーバーがあるかどうか
        if (index < 0) {
            //アンダーバーがない
            pro = colum.substring(0, 1).toLowerCase() + colum.substring(1);//首字母小写
        } else {
            //アンダーバーがある
            StringBuilder sb = new StringBuilder();
            String[] colums = colum.split("_");
            for (int i = 0; i < colums.length; i++) {
                if (i == 0) {
                    //拼接第一个,并将首字母小写
                    sb.append(colums[i].substring(0, 1).toLowerCase() + colums[i].substring(1));
                } else {
                    //除了第一个都将首字母大写
                    sb.append(colums[i].substring(0, 1).toUpperCase() + colums[i].substring(1));
                }
            }
            pro = sb.toString();
        }

        return pro;
    }

    /**
     * 生成包名
     */
    private String getPackageName(String path) {
        int index = path.indexOf("java\\");
        String newPackage = "";
        if (index > 0) {
            String substring = path.substring(index + 5);
            newPackage = substring.replace("\\", ".");
        }
        return newPackage;
    }

    /**
     * 生成文件
     *
     * @param fileName 文件名
     * @param info 要写入的内容
     * @throws IOException
     */
    private void getFile(String fileName, String info, String path) throws IOException {
        //生成文件
        File file = new File(path + "\\" + fileName + ".java");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        writer.write(info);
        writer.flush();
        writer.close();
    }

}
