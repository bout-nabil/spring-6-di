package nbo.springframework.spring6di.controllers;

import nbo.springframework.spring6di.services.IGreetingService;

public class SetterInjectedController {
    private IGreetingService iGreetingService;

    public void set_iGreetingService(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello() {
        return iGreetingService.getGreeting();
    }
}
