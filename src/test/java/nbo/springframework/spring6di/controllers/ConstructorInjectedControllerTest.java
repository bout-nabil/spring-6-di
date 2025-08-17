package nbo.springframework.spring6di.controllers;

import nbo.springframework.spring6di.services.GreetingServiceImpl;
import nbo.springframework.spring6di.services.IGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ConstructorInjectedControllerTest {
    @Autowired
    ConstructorInjectedController constructorInjectedController;

//    @BeforeEach
//    void setUp() {
//        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.SayHello());
    }
}