package pers.young.springcloudribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class RibbonController {

    @Autowired
    private LoadBalancerClient client;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {
        String dc = restTemplate.getForObject("http://springcloudprovider/ribbontest",String.class);
        return dc;
    }

}
