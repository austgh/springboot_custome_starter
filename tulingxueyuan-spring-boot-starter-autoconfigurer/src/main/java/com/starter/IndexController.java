package com.starter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by think on 2021/3/29.
 */
@RestController
public class IndexController {
    HelloProperties helloProperties;

    public IndexController(HelloProperties helloProperties) {
        this.helloProperties=helloProperties;
    }

    @RequestMapping("/")
    public String index(){
        return helloProperties.getName()+"欢迎您";
    }
}
