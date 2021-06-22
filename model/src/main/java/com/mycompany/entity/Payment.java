package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "payment")
public class Payment {

    //支払ID
    private String paymentId;
    //ユーザID
    private Integer userId;
    //支払総額
    private Integer payTotal;
    //支払数量
    private Integer payQuantity;
    //支払方法
    private Integer payMethod;
    //支払時間
    private Date payTime;

}
