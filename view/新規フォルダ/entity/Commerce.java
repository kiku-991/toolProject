package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = commerce)
public class Commerce {

    //オーダーID
    private String orderId;
    //支払いID
    private String paymentId;
    //物流ID
    private String shippingId;
    //ユーザID
    private Integer userId;
    //作成時間
    private Date createdate;

}