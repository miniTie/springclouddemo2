package pers.young.springcloudeureka3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloudeureka3Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudeureka3Application.class, args);
    }

}
