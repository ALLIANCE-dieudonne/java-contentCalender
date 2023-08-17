package com.alliance.contentcalender;

import com.alliance.contentcalender.model.Content;
import com.alliance.contentcalender.model.Status;
import com.alliance.contentcalender.model.Type;
import com.alliance.contentcalender.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


    }

    @Bean
    CommandLineRunner commandLineRunner(ContentRepository repository) {
        return args -> {
            Content content = new Content(null, "my the second title", "this is it", Status.IDEA, Type.ARTICLE, LocalDateTime.now(), null, "");
            repository.save(content);
        };
    }

}

