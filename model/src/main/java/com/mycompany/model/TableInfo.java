/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 * tableInfo
 */
@Getter
@Setter
public class TableInfo {

    //テーブル名
    public String tableName;
    //カラム名
    public String columnName;
    //型
    public Object dataType;
    //コメント
    public String comment;

}
