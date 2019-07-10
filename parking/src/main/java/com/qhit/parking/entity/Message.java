package com.qhit.parking.entity;

import java.util.Date;

public class Message {
    private Integer id;

    private String content;

    private Integer userId;

    private String userName;

    private Date createdate;

    private Integer adminId;

    private String adminName;

    private String answer;

    private Date answerdate;

    public Message(Integer id, String content, Integer userId, String userName, Date createdate, Integer adminId, String adminName, String answer, Date answerdate) {
        this.id = id;
        this.content = content;
        this.userId = userId;
        this.userName = userName;
        this.createdate = createdate;
        this.adminId = adminId;
        this.adminName = adminName;
        this.answer = answer;
        this.answerdate = answerdate;
    }

    public Message() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Date getAnswerdate() {
        return answerdate;
    }

    public void setAnswerdate(Date answerdate) {
        this.answerdate = answerdate;
    }
}