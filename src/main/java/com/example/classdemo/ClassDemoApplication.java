package com.example.classdemo;

import com.example.classdemo.controller.VisitorJpaController;
import com.example.classdemo.model.VisitorSystem;
import com.example.classdemo.repository.VisitorJpaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ClassDemoApplication.class, args);

    }

    @Autowired
    VisitorJpaController visitorJpaController;


    @Override
    public void run(String... args) throws Exception {
        VisitorSystem p1 = new VisitorSystem(1, "Robin","Hillwoods","K2G4D6","asb@gmail.com","1234567890") ;
        visitorJpaController.createVisitor(p1);
        VisitorSystem p2 = new VisitorSystem(2, "Robin","Hillwoods","K2G4D6","asb@gmail.com","1234567890") ;
        visitorJpaController.createVisitor(p2);
        VisitorSystem p3 = new VisitorSystem(3, "Robin","Hillwoods","K2G4D6","asb@gmail.com","1234567890") ;
        visitorJpaController.createVisitor(p3);
        VisitorSystem p4 = new VisitorSystem(4, "Robin","Hillwoods","K2G4D6","asb@gmail.com","1234567890") ;
        visitorJpaController.createVisitor(p4);
        VisitorSystem p5 = new VisitorSystem(5, "Robin","Hillwoods","K2G4D6","asb@gmail.com","1234567890") ;
        visitorJpaController.createVisitor(p5);
    }
}
