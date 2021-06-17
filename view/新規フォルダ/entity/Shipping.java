package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = shipping)
public class Shipping {

    //•¨—¬ID
    private String shippingId;
    //”z’B‰ïĞ
    private String courierCompany;
    //‰×•¨”Ô†
    private String trackingNumber;
    //”­‘—ŠÔ
    private Date deliveryTime;
    //“Í‚¯ŠÔ
    private Date receiptTime;

}