package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = product_img)
public class ProductImg {

    //���iID
    private Integer productId;
    //���̑��ʐ^
    private String productImg;

}