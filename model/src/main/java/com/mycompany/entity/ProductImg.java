package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "product_img")
public class ProductImg {

    //商品ID
    private Integer productId;
    //その他写真
    private String productImg;

}
