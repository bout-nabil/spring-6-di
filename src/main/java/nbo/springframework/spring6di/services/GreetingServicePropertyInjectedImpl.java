package nbo.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("greetingServicePropertyInjectedImpl")
public class GreetingServicePropertyInjectedImpl implements IGreetingService{
    @Override
    public String getGreeting() {
        return "Hi!! This is from the PropertyInjectedImpl";
    }
}
