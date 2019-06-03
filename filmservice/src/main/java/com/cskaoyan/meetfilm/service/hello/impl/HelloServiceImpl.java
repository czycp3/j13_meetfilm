package com.cskaoyan.meetfilm.service.hello.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cskaoyan.meetfilm.bean.actor.Actor;
import com.cskaoyan.meetfilm.mapper.HelloMapper;
import com.cskaoyan.meetfilm.service.hello.HelloService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author czy
 * @date 2019/6/3 16:44
 */
@Service(interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService{

    private HelloMapper helloMapper;

    @Autowired
    public HelloServiceImpl(HelloMapper helloMapper) {
        this.helloMapper = helloMapper;
    }

    @Override
    public Actor hello() {
        Logger logger = Logger.getLogger(this.getClass());
        Actor actor = helloMapper.queryActorById(1);
        logger.info(actor);
        return actor;
    }
}
