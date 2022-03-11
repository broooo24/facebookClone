package com.example.demo.service.databaseseeder;

import com.example.demo.domain.entity.*;
import com.example.demo.repository.*;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class Seeder {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    PictureRepository pictureRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    VideoRepository videoRepository;

    public void seedRoles() {
        RoleEntity role = new RoleEntity();
        role.setName("admin");
        roleRepository.save(role);

        RoleEntity role2 = new RoleEntity();
        role2.setName("user");
        roleRepository.save(role2);

        List<RoleEntity> roleList = new ArrayList<>();
        roleList.add(role2);

        UserEntity user = new UserEntity();
        user.setUsername("admin");
        user.setPassword("1234");
        user.setAge(19);
        user.setNickName("ad");
        user.setCountFriends(2);
        user.setRoleEntities(roleList);

        userRepository.save(user);

        UserEntity user2 = new UserEntity();
        user2.setUsername("geza");
        user2.setPassword("1234");
        user2.setAge(22);
        user2.setNickName("g");
        user2.setCountFriends(3);
        user2.setRoleEntities(roleList);
        userRepository.save(user2);

        CommentEntity comment = new CommentEntity();
        comment.setContent("Proba");
        comment.setFrom(user);
        comment.setDate(new Date());
        commentRepository.save(comment);

        MessageEntity message = new MessageEntity();
        message.setFrom(user);
        message.setTo(user2);
        message.setDate(new Date());
        message.setContent("Test");
        messageRepository.save(message);

        List<CommentEntity> commentList = new ArrayList<>();
        commentList.add(comment);
        PictureEntity picture = new PictureEntity();
        picture.setSrcPicture("/img/pic.png");
        picture.setComments(commentList);
        picture.setOwner(user);
        picture.setPublic(true);
        picture.setNumberOfLike(12);
        pictureRepository.save(picture);

        VideoEntity video = new VideoEntity();
        video.setComments(commentList);
        video.setSrcVideo("/img/test.png");
        video.setOwner(user);
        video.setPublic(true);
        video.setNumberOfLike(12);
        videoRepository.save(video);

    }
}
