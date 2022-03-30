package pers.young.springcloudfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.young.springcloudfeign.service.HelloFeignService;

@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignService helloFeignService;

    @RequestMapping("/helloFeign")
    public String helloFeign(@RequestParam(value="serviceId",required=true) String serviceId){
        return helloFeignService.helloFeign(serviceId);
    }
}