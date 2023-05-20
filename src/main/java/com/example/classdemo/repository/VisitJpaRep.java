package com.example.classdemo.repository;

import com.example.classdemo.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitJpaRep extends JpaRepository<Visit, Integer> {
}
