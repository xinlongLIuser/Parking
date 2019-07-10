package com.qhit.parking.entity;

import java.util.Date;

public class Notice {
    private Integer id;

    private String title;

    private String content;

    private Date createdate;

    private Integer adminId;

    private String adminName;

    public Notice(Integer id, String title, String content, Date createdate, Integer adminId, String adminName) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdate = createdate;
        this.adminId = adminId;
        this.adminName = adminName;
    }

    public Notice() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }
}