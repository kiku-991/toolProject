package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = shipping_history)
public class ShippingHistory {

    //—š—ğID
    private Integer historyId;
    //•¨—¬ID
    private Integer shippingId;
    //¤•iID
    private Integer productId;
    //‰×•¨”Ô†
    private String courierCompany;
    //”z’B‰ïĞ
    private String trackingNumber;
    //”­‘—ŠÔ
    private Date deliveryTime;
    //“Í‚¯ŠÔ
    private Date receiptTime;

}