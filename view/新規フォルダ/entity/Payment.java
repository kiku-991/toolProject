package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = payment)
public class Payment {

    //x•¥ID
    private String paymentId;
    //ƒ†[ƒUID
    private Integer userId;
    //x•¥‘Šz
    private Integer payTotal;
    //x•¥”—Ê
    private Integer payQuantity;
    //x•¥•û–@
    private Integer payMethod;
    //x•¥ŠÔ
    private Date payTime;

}