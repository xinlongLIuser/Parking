package com.qhit.parking.entity;

import java.util.Date;

public class Admin {
    private Integer id;

    private String name;

    private String password;

    private Date createdate;

    private Integer status;

    public Admin(Integer id, String name, String password, Date createdate, Integer status) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.createdate = createdate;
        this.status = status;
    }

    public Admin() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}