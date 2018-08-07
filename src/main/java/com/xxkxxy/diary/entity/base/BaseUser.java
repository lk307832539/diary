package com.xxkxxy.diary.entity.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by LK on 2018/8/6.
 */
@MappedSuperclass
public abstract class BaseUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String userName;
    private String nikeName;
    private String password;
    private String salt;
    private String email;
    private String validateCode;

    public BaseUser() {
        super();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }
}
