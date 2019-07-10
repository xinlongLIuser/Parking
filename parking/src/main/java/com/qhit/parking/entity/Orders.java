package com.qhit.parking.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;

import java.util.Date;

public class Orders {
    private Integer id;
    @Excel(name = "序号",orderNum = "1",mergeVertical = true)
    private String code;
    @Excel(name = "编号",orderNum = "2",mergeVertical = true)
    private Integer userId;

    private Integer parkId;

    private Date createdate;

    private Integer status;
    @Excel(name = "电话",orderNum = "3",mergeVertical = true)
    private Double total;
    @Excel(name = "停车时间",orderNum = "4",mergeVertical = true)
    private Date enddate;

    private Integer sumpark;
    @ExcelEntity(id = "id")
    private  User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Orders(Integer id, String code, Integer userId, Integer parkId, Date createdate, Integer status, Double total, Date enddate, Integer sumpark) {
        this.id = id;
        this.code = code;
        this.userId = userId;
        this.parkId = parkId;
        this.createdate = createdate;
        this.status = status;
        this.total = total;
        this.enddate = enddate;
        this.sumpark = sumpark;
    }

    public Orders() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getSumpark() {
        return sumpark;
    }

    public void setSumpark(Integer sumpark) {
        this.sumpark = sumpark;
    }
}