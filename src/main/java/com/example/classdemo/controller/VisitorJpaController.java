package com.example.classdemo.controller;

import com.example.classdemo.model.VisitorSystem;
import com.example.classdemo.repository.VisitorJpaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisitorJpaController {
    @Autowired
    VisitorJpaRep visitorJpaRep;


    @GetMapping("/visirots")
    public List<VisitorSystem> getAllVisitors(){
        return visitorJpaRep.findAll();
    }

    @PostMapping("/Visitor")
    public ResponseEntity<VisitorSystem> createVisitor(@RequestBody VisitorSystem visitorSystem){
        this.visitorJpaRep.save(visitorSystem);
        return ResponseEntity.created(null).build();

    }


}


