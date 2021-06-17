package com.mycompany.eneity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = userinfo)
public class Userinfo {

    //[UID
    private Integer id;
    //[U¼O
    private String name;
    //a¶ú
    private Date birth;
    //«Ê
    private Integer sex;
    //XÖÔ
    private String postcode;
    //s¹{§
    private String todoufuken;
    //sæ¬º
    private String shikucyouson;
    //ÚÔn
    private String cyoumebanchi;
    //dbÔ
    private String phone;
    //jbNl[
    private String nickname;
    //ACR
    private String icon;

}