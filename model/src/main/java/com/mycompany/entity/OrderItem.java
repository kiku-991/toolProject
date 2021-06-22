package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "order_item")
public class OrderItem {

    //オーダー番号
    private String orderId;
    //商品ID
    private Integer productId;
    //確定時商品名
    private String productName;
    //確定時商品単価
    private Integer productPrice;
    //確定時数量
    private Integer productQuantity;

}
