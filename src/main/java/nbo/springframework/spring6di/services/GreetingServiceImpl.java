package nbo.springframework.spring6di.services;

public class GreetingServiceImpl implements IGreetingService {
    @Override
    public String getGreeting() {
        return "Hello Everyone from Base Service!";
    }
}
