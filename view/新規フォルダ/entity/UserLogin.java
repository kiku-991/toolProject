package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = user_login)
public class UserLogin {

    //���[�UID
    private Integer userId;
    //���[�U���[��
    private String userMail;
    //�p�X���[�h
    private String userPassword;
    //��������
    private Date createDate;
    //�X�V����
    private Date updateDate;
    //����
    private String role;
    //���
    private Integer status;

}