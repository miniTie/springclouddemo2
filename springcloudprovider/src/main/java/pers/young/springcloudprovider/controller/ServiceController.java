package pers.young.springcloudprovider.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("/hello")
    public String test(@RequestParam(value="serviceId",required=true) String serviceId) {
        System.out.println("1111111111111111111"+serviceId);
        return "hello";
    }

    @RequestMapping("/ribbontest")
    public String test() {
        System.out.println("1111111111111111111ribbontest");
        return "1111111111111111111ribbontest";
    }
}
