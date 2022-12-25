package com.sgx.notifications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(
        scanBasePackages = {
                "com.sgx.notifications",
                "com.sgx.ampq"
})
@PropertySources({
        @PropertySource("classpath:clients-${spring.profiles.active}.properties")
})
public class NotificationsApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationsApplication.class,args);
    }
}
