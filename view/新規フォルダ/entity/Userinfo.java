package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = userinfo)
public class Userinfo {

    //ユーザID
    private Integer id;
    //ユーザ名前
    private String name;
    //誕生日
    private Date birth;
    //性別
    private Integer sex;
    //郵便番号
    private String postcode;
    //都道府県
    private String todoufuken;
    //市区町村
    private String shikucyouson;
    //丁目番地
    private String cyoumebanchi;
    //電話番号
    private String phone;
    //ニックネーム
    private String nickname;
    //アイコン
    private String icon;

}