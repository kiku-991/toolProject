package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "myorder")
public class Myorder {

    //オーダー番号
    private String orderId;
    //オーダー状態
    private Integer orderStatus;
    //購入金額
    private Integer purchasingPrice;
    //作成時間
    private Date createTime;
    //更新時間
    private Date modifyTime;

}
