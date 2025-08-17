package nbo.springframework.spring6di.controllers;

import nbo.springframework.spring6di.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    IGreetingService iGreetingService;

    public String SayHello() {
        return iGreetingService.getGreeting();
    }
}
