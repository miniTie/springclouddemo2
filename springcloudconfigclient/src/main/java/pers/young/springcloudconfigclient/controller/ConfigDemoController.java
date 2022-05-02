package pers.young.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigDemoController {

    //@Value("${sss}")
    private String info;
    @GetMapping("/demo")
    public String getGitConfiguration(){

        return info;
    }
}
