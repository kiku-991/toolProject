package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = store)
public class Store {

    //“X•ÜID
    private Integer storeId;
    //ƒ†[ƒUID
    private Integer userId;
    //“X•Ü–¼
    private String storeName;
    //“X•Ü—X•Ö
    private String storePostcode;
    //“X•Ü“s“¹•{Œ§
    private String storeTodoufuken;
    //“X•Üs‹æ’¬‘º
    private String storeShikucyouson;
    //“X•Ü’š–Ú”Ô’n
    private String storeCyomebanchi;
    //“X•Ü˜A—
    private String storePhone;
    //“X•Üó‘Ô
    private Integer storeStatus;

}