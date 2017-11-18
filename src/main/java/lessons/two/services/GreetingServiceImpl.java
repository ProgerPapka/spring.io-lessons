package lessons.two.services;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {

    private ApplicationContext context;

    @Required
    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}
