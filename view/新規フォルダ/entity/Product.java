package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = product)
public class Product {

    //¤iID
    private Integer productId;
    //XÜID
    private Integer storeId;
    //¤i¼
    private String productName;
    //¤i¿i
    private Integer productPrice;
    //¤iåvÊ^
    private String productImg;
    //¤ià¾
    private String productContents;
    //[J[
    private String maker;
    //ÝÉ
    private Integer stock;
    //óÔ
    private Integer status;
    //ì¬Ô
    private Date createTime;

}