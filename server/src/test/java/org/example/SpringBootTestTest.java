package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = UserRegistrationUseCasePropertySource.class)
@EnableConfigurationProperties
@ActiveProfiles("test")
public class SpringBootTestTest {
    @Autowired
    UserRegistrationUseCasePropertySource source;

    @Test
    public void test () {
        assertEquals(2, source.getMappings().size());
    }
}
