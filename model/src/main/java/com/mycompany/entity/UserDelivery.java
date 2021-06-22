package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user_delivery")
public class UserDelivery {

    //届けID
    private Integer id;
    //ユーザID
    private Integer userId;
    //届け郵便番号
    private String dpostcode;
    //届け都道府県
    private String dtodoufuken;
    //届け市区町村
    private String dshikucyouson;
    //届け丁目番地
    private String dcyoumebanchi;
    //連絡名前
    private String renrakuname;
    //連絡電話番号
    private String renrakuphone;
    //デフォルト住所
    private Integer defaultadd;

}
