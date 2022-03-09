package com.example.demo.domain.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;
    @ManyToOne
    private UserEntity from;
    @ManyToOne
    private UserEntity to;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UserEntity getFrom() {
        return from;
    }

    public void setFrom(UserEntity from) {
        this.from = from;
    }

    public UserEntity getTo() {
        return to;
    }

    public void setTo(UserEntity to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
