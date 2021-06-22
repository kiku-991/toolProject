package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "shipping")
public class Shipping {

    //物流ID
    private String shippingId;
    //配達会社
    private String courierCompany;
    //荷物番号
    private String trackingNumber;
    //発送時間
    private Date deliveryTime;
    //届け時間
    private Date receiptTime;

}
