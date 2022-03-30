package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClient {
    // value's propertysource is populated from the git backend configured in server's application.properties (file:///${user.home}/Desktop/config-repo)
    // to refresh @RefreshScope bean, call /actuator/refresh with empty POST
    @Value("${some.value}")
    private String value;


    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }

    @GetMapping("/")
    public String defaults() {
        return "Value is " + value;
    }
}