package nu.larsson.stefan.test.sckrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SuppressWarnings("UtilityClassWithoutPrivateConstructor")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
