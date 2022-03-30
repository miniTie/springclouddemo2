package pers.young.springcloudfeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.young.springcloudfeign.hystrix.HelloFeignFallback;

//@FeignClient(value = "service-hello")
@FeignClient(value = "springcloudprovider",fallback= HelloFeignFallback.class)
//@RequestMapping(value = "/hello")
public interface HelloFeignService {
    @RequestMapping(value = "/hello")
    String helloFeign(@RequestParam(value="serviceId",required=true) String serviceId);
}

