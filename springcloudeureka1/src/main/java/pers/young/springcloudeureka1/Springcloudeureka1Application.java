package pers.young.springcloudeureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloudeureka1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudeureka1Application.class, args);
    }

}
