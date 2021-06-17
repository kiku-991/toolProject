package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = shipping)
public class Shipping {

    //����ID
    private String shippingId;
    //�z�B���
    private String courierCompany;
    //�ו��ԍ�
    private String trackingNumber;
    //��������
    private Date deliveryTime;
    //�͂�����
    private Date receiptTime;

}