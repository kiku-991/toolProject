package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "mycart")
public class Mycart {

    //ユーザID
    private Integer userId;
    //商品ID
    private Integer productId;
    //数量
    private Integer quantity;
    //状態
    private Integer checkstatus;

}
