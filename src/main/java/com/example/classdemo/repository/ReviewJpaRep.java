package com.example.classdemo.repository;

import com.example.classdemo.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewJpaRep extends JpaRepository<Review,Integer> {
}
