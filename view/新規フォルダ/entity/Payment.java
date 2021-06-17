package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = payment)
public class Payment {

    //�x��ID
    private String paymentId;
    //���[�UID
    private Integer userId;
    //�x�����z
    private Integer payTotal;
    //�x������
    private Integer payQuantity;
    //�x�����@
    private Integer payMethod;
    //�x������
    private Date payTime;

}