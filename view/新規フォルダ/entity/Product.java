package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = product)
public class Product {

    //���iID
    private Integer productId;
    //�X��ID
    private Integer storeId;
    //���i��
    private String productName;
    //���i���i
    private Integer productPrice;
    //���i��v�ʐ^
    private String productImg;
    //���i����
    private String productContents;
    //���[�J�[
    private String maker;
    //�݌�
    private Integer stock;
    //���
    private Integer status;
    //�쐬����
    private Date createTime;

}