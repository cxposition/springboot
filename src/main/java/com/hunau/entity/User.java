package com.hunau.entity;

/**
 * Created by MI on 2019/1/16.
 */
public class User {
    private int id;
    private int pwd;

    public User() {
    }

    public User(int id, int pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
}
