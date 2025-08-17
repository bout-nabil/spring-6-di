package nbo.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryImpl implements IGreetingService{
    @Override
    public String getGreeting() {
        return "Hello Everyone from the Primary Service!";
    }
}
