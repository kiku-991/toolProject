package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

    //商品ID
    private Integer productId;
    //店舗ID
    private Integer storeId;
    //商品名
    private String productName;
    //商品価格
    private Integer productPrice;
    //商品主要写真
    private String productImg;
    //商品説明
    private String productContents;
    //メーカー
    private String maker;
    //在庫
    private Integer stock;
    //状態
    private Integer status;
    //作成時間
    private Date createTime;

}
