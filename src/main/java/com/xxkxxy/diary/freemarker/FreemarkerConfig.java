package com.xxkxxy.diary.freemarker;

import freemarker.template.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by LK on 8/10/2018.
 */
@Component
public class FreemarkerConfig {
    @Resource
    private Configuration configuration;
    @PostConstruct
    public void setSharedVariable(){
        //configuration.setSharedVariable("global",globalTag);//标签名与标签类
    }
}
