package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = UserRegistrationUseCasePropertySource.class)
@EnableConfigurationProperties()
@ActiveProfiles("test")
public class Tests {
    @Autowired
    UserRegistrationUseCasePropertySource source;

    @Test
    public void test () {
        System.out.println();
    }
}
