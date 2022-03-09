package com.example.demo.domain.entity;

import org.apache.catalina.User;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.*;
import javax.xml.crypto.Data;

@Entity
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserEntity getFrom() {
        return from;
    }

    public void setFrom(UserEntity from) {
        this.from = from;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @ManyToOne
    private UserEntity from;
    private Data date;
    private String content;
}
