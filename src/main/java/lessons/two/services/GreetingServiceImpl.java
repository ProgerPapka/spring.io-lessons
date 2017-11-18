package lessons.two.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}
