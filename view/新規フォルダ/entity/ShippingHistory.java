package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = shipping_history)
public class ShippingHistory {

    //����ID
    private Integer historyId;
    //����ID
    private Integer shippingId;
    //���iID
    private Integer productId;
    //�ו��ԍ�
    private String courierCompany;
    //�z�B���
    private String trackingNumber;
    //��������
    private Date deliveryTime;
    //�͂�����
    private Date receiptTime;

}