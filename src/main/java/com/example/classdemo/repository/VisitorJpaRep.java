package com.example.classdemo.repository;

import com.example.classdemo.model.VisitorSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorJpaRep extends JpaRepository<VisitorSystem, Integer> {
}
