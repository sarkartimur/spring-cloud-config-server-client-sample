package org.example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigServer
@Profile("dev")
public class ConfigServer implements InitializingBean {
    @Autowired
    UserRegistrationUseCasePropertySource ps;

    public static void main(String[] arguments) {
        SpringApplication.run(ConfigServer.class, arguments);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Starting");

    }
}