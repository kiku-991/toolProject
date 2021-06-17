package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = mycart)
public class Mycart {

    //ƒ†[ƒUID
    private Integer userId;
    //¤•iID
    private Integer productId;
    //”—Ê
    private Integer quantity;
    //ó‘Ô
    private Integer checkstatus;

}