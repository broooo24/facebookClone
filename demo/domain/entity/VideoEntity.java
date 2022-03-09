package com.example.demo.domain.entity;

import javax.persistence.*;
import java.util.ArrayList;
@Entity
public class VideoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String srcVideo;
    @OneToMany
    private ArrayList<CommentEntity> comments;
    @ManyToOne
    private UserEntity owner;
    private int numberOfLike;
    private boolean isPublic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSrcVideo() {
        return srcVideo;
    }

    public void setSrcVideo(String srcVideo) {
        this.srcVideo = srcVideo;
    }

    public ArrayList<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(ArrayList<CommentEntity> comments) {
        this.comments = comments;
    }

    public UserEntity getOwner() {
        return owner;
    }

    public void setOwner(UserEntity owner) {
        this.owner = owner;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }
}
