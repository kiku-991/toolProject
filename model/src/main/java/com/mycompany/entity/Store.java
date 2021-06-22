package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "store")
public class Store {

    //店舗ID
    private Integer storeId;
    //ユーザID
    private Integer userId;
    //店舗名
    private String storeName;
    //店舗郵便
    private String storePostcode;
    //店舗都道府県
    private String storeTodoufuken;
    //店舗市区町村
    private String storeShikucyouson;
    //店舗丁目番地
    private String storeCyomebanchi;
    //店舗連絡
    private String storePhone;
    //店舗状態
    private Integer storeStatus;

}
