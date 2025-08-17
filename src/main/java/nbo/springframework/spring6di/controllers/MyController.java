package nbo.springframework.spring6di.controllers;

import nbo.springframework.spring6di.services.GreetingServiceImpl;
import nbo.springframework.spring6di.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final IGreetingService iGreetingService;

    public MyController() {
        this.iGreetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in MyController");
        return iGreetingService.getGreeting();
    }
}
