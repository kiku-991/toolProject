package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = mycart)
public class Mycart {

    //���[�UID
    private Integer userId;
    //���iID
    private Integer productId;
    //����
    private Integer quantity;
    //���
    private Integer checkstatus;

}