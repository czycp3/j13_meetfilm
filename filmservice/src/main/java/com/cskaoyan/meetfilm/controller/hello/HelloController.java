package com.cskaoyan.meetfilm.controller.hello;

import com.cskaoyan.meetfilm.bean.actor.Actor;
import com.cskaoyan.meetfilm.service.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author czy
 * @date 2019/6/3 16:43
 */
@Controller
public class HelloController {

    private HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public Actor hello(){
        return helloService.hello();
    }
}
