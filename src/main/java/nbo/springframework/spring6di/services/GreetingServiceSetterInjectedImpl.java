package nbo.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("greetingServiceSetterInjectedImpl")
public class GreetingServiceSetterInjectedImpl implements IGreetingService{
    @Override
    public String getGreeting() {
        return "Hi!! This is a greeting from GreetingServiceSetterInjectedImpl";
    }
}
