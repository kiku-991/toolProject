package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = user_delivery)
public class UserDelivery {

    //Í¯ID
    private Integer id;
    //[UID
    private Integer userId;
    //Í¯XÖÔ
    private String dpostcode;
    //Í¯s¹{§
    private String dtodoufuken;
    //Í¯sæ¬º
    private String dshikucyouson;
    //Í¯ÚÔn
    private String dcyoumebanchi;
    //A¼O
    private String renrakuname;
    //AdbÔ
    private String renrakuphone;
    //ftHgZ
    private Integer defaultadd;

}