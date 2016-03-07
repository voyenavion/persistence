package com.example;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by shaungould on 3/7/16.
 */

@Entity
public class User {

    @Column(name="USER_NICKNAME")
    private String nickName;

    @Column(name="USER_EMAIL")
    private String email;

    @Column(name="USER_PASSWORD")
    private String password;

    @Id
    @GeneratedValue
    @Column(name="USER_ID")
    private Long id;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
