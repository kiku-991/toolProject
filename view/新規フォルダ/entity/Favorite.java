package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = favorite)
public class Favorite {

    //���[�UID
    private Integer userId;
    //���iID
    private Integer productId;
    //�쐬����
    private Date createdate;

}