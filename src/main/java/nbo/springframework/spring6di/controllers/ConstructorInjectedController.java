package nbo.springframework.spring6di.controllers;

import nbo.springframework.spring6di.services.IGreetingService;

public class ConstructorInjectedController {
    private final IGreetingService iGreetingService;

    public ConstructorInjectedController(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String SayHello() {
        return iGreetingService.getGreeting();
    }
}
