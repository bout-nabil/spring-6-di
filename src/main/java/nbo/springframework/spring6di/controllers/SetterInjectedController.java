package nbo.springframework.spring6di.controllers;

import nbo.springframework.spring6di.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private IGreetingService iGreetingService;
    @Autowired
    @Qualifier("greetingServiceSetterInjectedImpl")
    public void set_iGreetingService(IGreetingService iGreetingService) {
        System.out.println("********************* set_iGreetingService");
        this.iGreetingService = iGreetingService;
    }

    public String sayHello() {
        return iGreetingService.getGreeting();
    }
}
