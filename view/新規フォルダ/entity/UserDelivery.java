package com.mycompany.eneity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = user_delivery)
public class UserDelivery {

    //�͂�ID
    private Integer id;
    //���[�UID
    private Integer userId;
    //�͂��X�֔ԍ�
    private String dpostcode;
    //�͂��s���{��
    private String dtodoufuken;
    //�͂��s�撬��
    private String dshikucyouson;
    //�͂����ڔԒn
    private String dcyoumebanchi;
    //�A�����O
    private String renrakuname;
    //�A���d�b�ԍ�
    private String renrakuphone;
    //�f�t�H���g�Z��
    private Integer defaultadd;

}