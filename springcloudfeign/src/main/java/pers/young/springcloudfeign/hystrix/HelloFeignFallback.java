package pers.young.springcloudfeign.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import pers.young.springcloudfeign.service.HelloFeignService;

@Component
public class HelloFeignFallback implements HelloFeignService {

    public String helloFeign(@RequestParam(value="serviceId",required=true) String serviceId){

        System.out.println("error");
        return "error";

    }

}
