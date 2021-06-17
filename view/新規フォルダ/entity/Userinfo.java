package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = userinfo)
public class Userinfo {

    //���[�UID
    private Integer id;
    //���[�U���O
    private String name;
    //�a����
    private Date birth;
    //����
    private Integer sex;
    //�X�֔ԍ�
    private String postcode;
    //�s���{��
    private String todoufuken;
    //�s�撬��
    private String shikucyouson;
    //���ڔԒn
    private String cyoumebanchi;
    //�d�b�ԍ�
    private String phone;
    //�j�b�N�l�[��
    private String nickname;
    //�A�C�R��
    private String icon;

}