package com.example.diunotessharingportal;

public class User {


    private String topic;
    private String course;
    private String ftype;
    private String udate;
    private String uploader;


    public User(String topic, String course, String ftype, String udate, String uploader) {
        this.topic = topic;
        this.course = course;
        this.ftype = ftype;
        this.udate = udate;
        this.uploader = uploader;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public String getUdate() {
        return udate;
    }

    public void setUdate(String udate) {
        this.udate = udate;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }
}
