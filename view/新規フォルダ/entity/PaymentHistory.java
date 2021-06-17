package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = payment_history)
public class PaymentHistory {

    //ðID
    private Integer historyId;
    //x¥ID
    private String paymentId;
    //[UID
    private Integer userId;
    //x¥z
    private Integer payTotal;
    //x¥Ê
    private Integer payQuantity;
    //x¥û@
    private Integer payMethod;
    //x¥Ô
    private Date payTime;

}