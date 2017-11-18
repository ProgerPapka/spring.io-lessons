package lessons.two;

import lessons.two.services.GreetingService;
import lessons.two.services.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Конфигурационный класс Spring IoC контейнера
 */
@Configuration
public class LessonsConfiguration {

    @Bean
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }

}
