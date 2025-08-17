package nbo.springframework.spring6di.controllers;

import nbo.springframework.spring6di.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final IGreetingService iGreetingService;
    @Autowired
    public ConstructorInjectedController(IGreetingService iGreetingService) {
        System.out.println("********************* ConstructorInjectedController");
        this.iGreetingService = iGreetingService;
    }

    public String SayHello() {
        return iGreetingService.getGreeting();
    }
}
