package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user_login")
public class UserLogin {

    //ユーザID
    private Integer userId;
    //ユーザメール
    private String userMail;
    //パスワード
    private String userPassword;
    //生成時間
    private Date createDate;
    //更新時間
    private Date updateDate;
    //役割
    private String role;
    //状態
    private Integer status;

}
