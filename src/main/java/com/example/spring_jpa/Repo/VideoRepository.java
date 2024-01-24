package com.example.spring_jpa.Repo;

import com.example.spring_jpa.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {
}
