package nbo.springframework.spring6di.controllers.i18n;

import nbo.springframework.spring6di.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {
    private final IGreetingService iGreetingService;

    public Myi18NController(@Qualifier("i18NService") IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String SayHello() {
        return iGreetingService.getGreeting();
    }
}
