package lessons.two;

import lessons.two.services.GreetingService;
import lessons.two.services.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 * Конфигурационный класс Spring IoC контейнера
 */
@Configuration
@ComponentScan(basePackages = "lessons.two.services")
public class LessonsConfiguration {

    @Bean
    @Description("Bean - Service which say greet")
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }

}
