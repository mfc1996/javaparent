/**
 * Copyright (C),2019, 金科教育
 * FileName: User
 * Author:   马法冲
 * Date:     2019/4/11 18:22
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author MC
 * @create 2019/4/11
 * @since 1.0.0
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {

    private static final long serialVersionUID = -3166618780719852607L;
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private Integer userSex;
    private Integer userAge;
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    private String userNumber;
    private String userPassword;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userAge=" + userAge +
                ", birth=" + birth +
                ", userNumber='" + userNumber + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}