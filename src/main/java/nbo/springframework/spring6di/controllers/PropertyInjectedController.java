package nbo.springframework.spring6di.controllers;

import nbo.springframework.spring6di.services.IGreetingService;

public class PropertyInjectedController {

    IGreetingService iGreetingService;

    public String SayHello() {
        return iGreetingService.getGreeting();
    }
}
