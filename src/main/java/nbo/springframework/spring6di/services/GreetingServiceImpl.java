package nbo.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {
    @Override
    public String getGreeting() {
        return "Hello Everyone from Base Service!";
    }
}
