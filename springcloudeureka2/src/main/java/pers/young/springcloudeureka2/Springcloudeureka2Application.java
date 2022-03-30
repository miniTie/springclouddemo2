package pers.young.springcloudeureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloudeureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudeureka2Application.class, args);
    }

}
