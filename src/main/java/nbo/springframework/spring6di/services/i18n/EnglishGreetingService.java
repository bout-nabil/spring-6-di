package nbo.springframework.spring6di.services.i18n;

import nbo.springframework.spring6di.services.IGreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class EnglishGreetingService implements IGreetingService {
    @Override
    public String getGreeting() {
        return "Hello World! - ENGLISH";
    }
}
