package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "favorite")
public class Favorite {

    //ユーザID
    private Integer userId;
    //商品ID
    private Integer productId;
    //作成時間
    private Date createdate;

}
