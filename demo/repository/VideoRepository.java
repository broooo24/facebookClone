package com.example.demo.repository;

import com.example.demo.domain.entity.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, Integer> {

}
